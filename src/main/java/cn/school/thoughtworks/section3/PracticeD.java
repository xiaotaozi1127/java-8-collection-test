package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<String,Integer>(){};
        collectionA.stream().distinct().forEach(i -> {
            if(i.contains("-")){
                String[] split = i.split("-");
                Integer size =  Integer.parseInt(split[1]);
                collection3.put(split[0], size);
            }
            else{
                Integer size = collectionA.stream().filter(item-> item == i).collect(Collectors.toList()).size();
                collection3.put(i, size);
            }
        });

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
