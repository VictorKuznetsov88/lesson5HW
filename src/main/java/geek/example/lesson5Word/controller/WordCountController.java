package geek.example.lesson5Word.controller;

import geek.example.lesson5Word.service.CountWordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WordCountController {

    private final CountWordService countWordService;


    public WordCountController(CountWordService countWordService) {
        this.countWordService = countWordService;
    }

    @PostMapping("/wordCount")
    public WordCountResponse wordCount(@RequestBody WordCountRequest wordCountRequest){
        WordCountResponse wordCountResponse = new WordCountResponse();
        wordCountResponse.setIdRequest(wordCountResponse.getIdRequest());
        Map<String, Long> stringLongMap= countWordService.countWord(wordCountRequest.getText());

        WordCountResponse response = new WordCountResponse();

        response.setIdRequest(wordCountRequest.getIdRequest());
        response.setMapCount(stringLongMap);
        return response;

    }
}
