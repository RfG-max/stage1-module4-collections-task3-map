package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> resultMap = new HashMap<>();
        int i,j;
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (!resultMap.containsKey(entry.getValue())){
                resultMap.put(entry.getValue(),entry.getKey());
            }else{
                i = entry.getKey();
                j = resultMap.get(entry.getValue());
                if (i < j){
                    resultMap.put(entry.getValue(),i);
                }
            }
        }

        return resultMap;
    }
}
