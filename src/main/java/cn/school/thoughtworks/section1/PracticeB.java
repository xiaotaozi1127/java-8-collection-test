package cn.school.thoughtworks.section1;

import cn.school.thoughtworks.Helper;
import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> converted = new ArrayList<>();
        for(List<String> item: collection2){
            converted.addAll(item);
        }

        Helper helper = new Helper();
        return helper.CollectSameElements(collection1, converted);
    }
}
