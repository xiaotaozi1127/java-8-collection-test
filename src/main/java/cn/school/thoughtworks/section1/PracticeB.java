package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> converted = new ArrayList<>();
        for(List<String> item: collection2){
            converted.addAll(item);
        }

        PracticeA practiceA = new PracticeA();
        return practiceA.collectSameElements(collection1, converted);
    }
}
