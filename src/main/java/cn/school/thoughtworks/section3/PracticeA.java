package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        List<String> value = new ArrayList<>();
        collectionB.entrySet().forEach(s -> value.addAll(s.getValue()));

        Map<String, Integer> output = new HashMap<>();
        collectionA.entrySet().forEach(s -> {
            String key = s.getKey();
            Integer size = s.getValue();

            if(value.contains(key)){
                output.put(key, size - 1);
            }else{
                output.put(key, size);
            }
        });

        return output;
    }
}
