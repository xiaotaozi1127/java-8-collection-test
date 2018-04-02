package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> converted = new ArrayList<>();
        for(List<String> item: collection2){
            for(String string:item){
                converted.add(string);
            }
        }

        return collection1.stream()
                .filter(item -> converted.contains(item))
                .collect(Collectors.toList());
    }
}
