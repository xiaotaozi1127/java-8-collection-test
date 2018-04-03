package cn.school.thoughtworks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Helper {
    public Map<String,Integer> GetElementSize(List<String> collectionA){
        Map<String,Integer> collection3 = new HashMap<String,Integer>(){};
        collectionA.stream().distinct().forEach(i ->
                collection3.put(i,
                        collectionA.stream().filter(item -> item == i)
                                .collect(Collectors.toList()).size()));
        return collection3;
    }

    public Map<String,Integer> GetElementSizeWithDash(List<String> collectionA){
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
        return collection3;
    }

    public Map<String,Integer> GetSameElementSizeDividedByThree(Map<String,Integer> collection1, List<String> collection2){
        Map<String,Integer> output = new HashMap<>();
        collection1.entrySet().forEach(s -> {
            if(collection2.contains(s.getKey())){
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
