package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> converted = new ArrayList<>();
        collection2.entrySet().forEach(i -> converted.addAll(i.getValue()));
        PracticeA practiceA = new PracticeA();
        return practiceA.collectSameElements(collection1, converted);
    }
}
