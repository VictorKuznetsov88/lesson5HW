package geek.example.lesson5Word.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class WordCountResponse implements Serializable {
    private Long idRequest;
    private Map<String,Long> mapCount = new HashMap<>();

    public Long getIdRequest(){return idRequest;}

    public void setIdRequest(Long idRequest){this.idRequest = idRequest;}

    public Map<String, Long> getMapCount() {return mapCount;}

    public  void setMapCount(Map<String, Long> mapCount){this.mapCount = mapCount;}

    @Override
    public String toString() {
        return "WordCountResponse{" +
                "idRequest = " + idRequest +
                ", mapCount = " + mapCount +
    '}';
    }



}
