package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<String,Integer>(){};
        collection1.stream().distinct().forEach(i -> {
            Map<String,Integer> itemCount = GetItemCount(i, collection1);
            String key = itemCount.keySet().toArray()[0].toString();
            Integer size = Integer.parseInt(itemCount.get(key).toString());
            if(result.containsKey(key)){
                result.put(key, Integer.parseInt(result.get(key).toString()) + size);
            }else{
                result.put(key, size);
            }
        });
        return result;
    }

    private Map<String, Integer> GetItemCount(String item, List<String> collection1){
        Map<String, Integer> map = new HashMap<>();
        if(item.contains("-") || item.contains(":")) {
            String deliter = item.contains("-") ? "-" : ":";
            String[] split = item.split(deliter);
            Integer size =  Integer.parseInt(split[1]);
            String key = split[0];
            map.put(key, size);
        }
        else if(item.contains("[") && item.contains("]")){
            Integer startIndex = item.indexOf("[");
            Integer endIndex = item.indexOf("]");
            Integer size = Integer.parseInt(item.substring(startIndex + 1, endIndex));
            String key = item.substring(0, startIndex);
            map.put(key, size);
        }
        else{
            map.put(item, collection1
                    .stream()
                    .filter(i -> i == item)
                    .collect(Collectors.toList()).size());
        }
        return map;
    }
}
