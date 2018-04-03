package cn.school.thoughtworks.section3;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        collectionA.stream().distinct().forEach(i ->
                collection3.put(i,
                        collectionA.stream().filter(item -> item == i)
                                .collect(Collectors.toList()).size()));

        List<String> keys = new ArrayList<>();
        collectionB.entrySet().forEach(s -> keys.addAll(s.getValue()));
        Map<String,Integer> output = new HashMap<>();

        collection3.entrySet().forEach(s -> {
            if(keys.contains(s.getKey())){
                int size = Integer.parseInt(s.getValue().toString());
                output.put(s.getKey(), size - size / 3);
            }
            else{
                output.put(s.getKey(), Integer.parseInt(s.getValue().toString()));
            }
        });

        return output;
    }
}
