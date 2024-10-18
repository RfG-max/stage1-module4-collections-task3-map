package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] str = sentence.split("[,\\s.]");
        int i;
        for (String value: str ) {
            if (!value.equals("")) {
                if (resultMap.containsKey(value.toLowerCase())){
                i = resultMap.get(value.toLowerCase());
                i++;
                resultMap.put(value.toLowerCase(),i);
                } else{
                    resultMap.put(value.toLowerCase(),1);
                }
            }
        }
        return resultMap;
    }
}

