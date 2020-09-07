package geek.example.lesson5Word.service;

import geek.example.lesson5Word.controller.WordCountRequest;
import geek.example.lesson5Word.controller.WordCountResponse;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountWordService {
    public Map<String, Long> countWord(String input){

        List<String> liststrings = Arrays.asList(input.toLowerCase().split("\\W+"));
        Map<String, Long> result = new HashMap<>();
        for (String cw : liststrings) {
            if (result.containsKey(cw)){
                Long currentCount = result.get(cw);
                result.put(cw, currentCount + 1);
            }else{
                result.put(cw, 1L);

            }
        }
        return result;
    }
}
