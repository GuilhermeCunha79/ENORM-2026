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
            .andExpect(jsonPath("$.model").value("YouTube"));
    }

    @Test
    void generatedCollectionEndpointIsReachable() throws Exception {
        mockMvc.perform(get("/api/channels"))
            .andExpect(status().isOk());
    }

    @Test
    void missingGeneratedResourceReturnsApiError() throws Exception {
        mockMvc.perform(get("/api/channels/999999999"))
            .andExpect(status().isNotFound())
            .andExpect(jsonPath("$.message").exists());
    }
}
