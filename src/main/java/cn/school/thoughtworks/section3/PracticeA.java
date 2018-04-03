package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection2 = new HashMap<String,Integer>(){};
        List<String> value = new ArrayList<>();
        collectionB.entrySet().forEach(s -> value.addAll(s.getValue()));

        value.stream().distinct().forEach(i -> {
            Integer count = value.stream().filter(j -> j == i).collect(Collectors.toList()).size();
            collection2.put(i, count);
        });

        Map<String, Integer> output = new HashMap<>();
        collectionA.entrySet().forEach(s -> {
            String key = s.getKey();
            Integer size = s.getValue();

            if(collection2.containsKey(key)){
                output.put(key, size - Integer.parseInt(collection2.get(key).toString()));
            }else{
                output.put(key, size);
            }
        });

        return output;
    }
}
