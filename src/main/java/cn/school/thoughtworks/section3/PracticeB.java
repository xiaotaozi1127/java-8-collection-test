package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        List<String> value = new ArrayList<>();
        collectionB.entrySet().forEach(s -> value.addAll(s.getValue()));

        Map<String,Integer> output = new HashMap<>();
        collectionA.entrySet().forEach(s -> {
            if(value.contains(s.getKey())){
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
