package geek.example.lesson5Word;

import com.fasterxml.jackson.databind.ObjectMapper;
import geek.example.lesson5Word.controller.WordCountRequest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.io.File;

@SpringBootTest
class Lesson5ApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void check() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        WordCountRequest wordCountRequest = new WordCountRequest(1L, "Grut! I am Grut!");
        objectMapper.writerFor(WordCountRequest.class).writeValue(new File("demo.json"),wordCountRequest);
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders
                .post("/wordCount")
                .content(objectMapper.writerFor(WordCountRequest.class).writeValueAsString(wordCountRequest))
                .contentType("application/json")
        );


    }

}
