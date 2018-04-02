package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<String,Integer>(){};
        collection1.stream().distinct().forEach(i -> {
            if(i.contains("-")){
                String[] split = i.split("-");
                Integer size =  Integer.parseInt(split[1]);
                result.put(split[0], size);
            }
            else{
                Integer size = collection1.stream().filter(item-> item == i).collect(Collectors.toList()).size();
                result.put(i, size);
            }
        });
        return result;
    }
}
