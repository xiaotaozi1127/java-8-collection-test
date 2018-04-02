package cn.school.thoughtworks.section1;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        return collection1.stream()
                .filter(item -> collection2.contains(item))
                .collect(Collectors.toList());
    }
}
