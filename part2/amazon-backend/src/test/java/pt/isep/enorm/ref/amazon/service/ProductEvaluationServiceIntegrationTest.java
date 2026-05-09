package pt.isep.enorm.ref.amazon.service;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;

@SpringBootTest
@AutoConfigureMockMvc
class ProductEvaluationServiceIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AmazonUserRepository amazonUserRepository;

    @Test
    void registerReturnsJwtTokenAndDefaultUserRole() throws Exception {
        mockMvc.perform(post("/api/auth/register")
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "username": "atb-register",
                      "password": "atb"
                    }
                    """))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.token").isNotEmpty())
            .andExpect(jsonPath("$.username").value("atb-register"))
                .andExpect(jsonPath("$.role").value("BUYER"));
    }

    @Test
    void userPromotedToSellerCanCreateProduct() throws Exception {
        String sellerToken = registerAndExtractToken("atb-seller", "atb");

        AmazonUser seller = amazonUserRepository.findByUsername("atb-seller").orElseThrow();
        seller.setRole(Role.SELLER);
        amazonUserRepository.save(seller);

        mockMvc.perform(post("/api/products")
                .header("Authorization", "Bearer " + sellerToken)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "name": "tv",
                      "description": "wide screen tv",
                      "price": 299.99
                    }
                    """))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.id").isNumber())
            .andExpect(jsonPath("$.name").value("tv"))
            .andExpect(jsonPath("$.description").value("wide screen tv"))
            .andExpect(jsonPath("$.price").value(299.99));
    }

    @Test
    void authenticatedUserCanSubmitPendingReviewAndVerifiedBuyerAffectsAverage() throws Exception {
        String adminToken = registerAndExtractToken("atb-average-admin", "atb");

        AmazonUser seller = amazonUserRepository.findByUsername("atb-average-admin").orElseThrow();
        seller.setRole(Role.SELLER);
        amazonUserRepository.save(seller);

        Long productId = createProductAndExtractId(adminToken, "headphones", "wireless headphones", new BigDecimal("199.99"));

        String pendingUserToken = registerAndExtractToken("buyer-pending", "buyer");

        mockMvc.perform(post("/api/reviews")
                .header("Authorization", "Bearer " + pendingUserToken)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "comment": "Great product and fast delivery!",
                      "grade": 5,
                      "product": {
                        "id": %d
                      }
                    }
                    """.formatted(productId)))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.id").isNumber())
            .andExpect(jsonPath("$.comment").value("Great product and fast delivery!"))
            .andExpect(jsonPath("$.grade").value(5))
            .andExpect(jsonPath("$.status").value("PENDING"))
            .andExpect(jsonPath("$.verificationType").value("MANUAL"))
            .andExpect(jsonPath("$.verifiedBuyerAtSubmission").value(false))
            .andExpect(jsonPath("$.product.id").value(productId.intValue()));

        String verifiedBuyerToken = registerAndExtractToken("buyer-verified", "buyer");
        AmazonUser verifiedBuyer = amazonUserRepository.findByUsername("buyer-verified").orElseThrow();
        verifiedBuyer.setVerifiedBuyer(true);
        amazonUserRepository.save(verifiedBuyer);

        mockMvc.perform(post("/api/reviews")
                .header("Authorization", "Bearer " + verifiedBuyerToken)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "comment": "Excellent sound quality.",
                      "grade": 5,
                      "product": {
                        "id": %d
                      }
                    }
                    """.formatted(productId)))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.status").value("APPROVED"))
            .andExpect(jsonPath("$.verificationType").value("AUTOMATIC"))
            .andExpect(jsonPath("$.verifiedBuyerAtSubmission").value(true));

        mockMvc.perform(get("/api/products/{productId}/average-rating", productId))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.productId").value(productId.intValue()))
            .andExpect(jsonPath("$.averageStars").value(5.0))
            .andExpect(jsonPath("$.totalReviews").value(1));
    }

    @Test
    void buyerWithOrderForProductGetsAutomaticVerification() throws Exception {
        String sellerToken = registerAndExtractToken("atb-order-seller", "atb");

        AmazonUser seller = amazonUserRepository.findByUsername("atb-order-seller").orElseThrow();
        seller.setRole(Role.SELLER);
        amazonUserRepository.save(seller);

        Long productId = createProductAndExtractId(sellerToken, "keyboard", "mechanical keyboard", new BigDecimal("89.99"));
        String buyerToken = registerAndExtractToken("buyer-with-order", "buyer");

        mockMvc.perform(post("/api/orders")
                .header("Authorization", "Bearer " + buyerToken)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "items": [
                        {
                          "productId": %d,
                          "quantity": 1
                        }
                      ]
                    }
                    """.formatted(productId)))
            .andExpect(status().isCreated());

        mockMvc.perform(post("/api/products/{productId}/reviews", productId)
                .header("Authorization", "Bearer " + buyerToken)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "comment": "Verified purchase review.",
                      "grade": 4,
                      "mediaReferences": [
                        {
                          "mediaType": "PHOTO",
                          "url": "https://example.org/review-photo.jpg"
                        },
                        {
                          "mediaType": "VIDEO",
                          "url": "https://example.org/review-video.mp4"
                        }
                      ]
                    }
                    """))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.status").value("APPROVED"))
            .andExpect(jsonPath("$.verificationType").value("AUTOMATIC"))
            .andExpect(jsonPath("$.verifiedBuyerAtSubmission").value(true))
            .andExpect(jsonPath("$.mediaReferences.length()").value(2));

        mockMvc.perform(get("/api/products/{productId}/average-rating", productId))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.averageStars").value(4.0))
            .andExpect(jsonPath("$.totalReviews").value(1));
    }

    private String registerAndExtractToken(String username, String password) throws Exception {
        MvcResult result = mockMvc.perform(post("/api/auth/register")
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "username": "%s",
                      "password": "%s"
                    }
                    """.formatted(username, password)))
            .andExpect(status().isCreated())
            .andReturn();

        JsonNode jsonNode = objectMapper.readTree(result.getResponse().getContentAsString());
        return jsonNode.get("token").asText();
    }

    private Long createProductAndExtractId(String token, String name, String description, BigDecimal price) throws Exception {
        MvcResult result = mockMvc.perform(post("/api/products")
                .header("Authorization", "Bearer " + token)
                .contentType(APPLICATION_JSON)
                .content("""
                    {
                      "name": "%s",
                      "description": "%s",
                      "price": %s
                    }
                    """.formatted(name, description, price.toPlainString())))
            .andExpect(status().isCreated())
            .andReturn();

        JsonNode jsonNode = objectMapper.readTree(result.getResponse().getContentAsString());
        return jsonNode.get("id").asLong();
    }
}
