package pt.isep.enorm.ref;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
class AcceptanceTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void authenticationEndpointsAcceptGeneratedUserPayloads() throws Exception {
        mockMvc.perform(post("/api/auth/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"username\":\"acceptance-user\",\"password\":\"secret\",\"role\":\"USER\"}"))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.id").exists());

        mockMvc.perform(post("/api/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"username\":\"acceptance-user\",\"password\":\"secret\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.status").value("authenticated"))
            .andExpect(jsonPath("$.model").value("Reddit"));
    }

    @Test
    void generatedResourceCanBeCreatedReadAndListed() throws Exception {
        MvcResult created = mockMvc.perform(post("/api/subreddits")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"acceptance-subreddit\",\"source\":\"generated-acceptance-test\"}"))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.id").exists())
            .andExpect(jsonPath("$.name").value("acceptance-subreddit"))
            .andReturn();

        String id = created.getResponse().getContentAsString().replaceAll(".*\\\"id\\\":(\\d+).*", "$1");

        mockMvc.perform(get("/api/subreddits/{id}", id))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id").value(Integer.parseInt(id)));

        mockMvc.perform(get("/api/subreddits"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$").isArray());
    }

    @Test
    void missingGeneratedResourceReturnsApiError() throws Exception {
        mockMvc.perform(get("/api/subreddits/999999999"))
            .andExpect(status().isNotFound())
            .andExpect(jsonPath("$.message").exists());
    }

    @Test
    void generatedPolicyEndpointIsReachable() throws Exception {
        mockMvc.perform(get("/api/policies/validation-rules"))
            .andExpect(status().isOk());
    }

    @Test
    void generatedModerationEndpointIsReachable() throws Exception {
        mockMvc.perform(post("/api/moderation/reports/simulate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
            .andExpect(status().isOk());
    }
}
