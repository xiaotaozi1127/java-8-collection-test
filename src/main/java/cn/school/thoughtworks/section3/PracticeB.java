package cn.school.thoughtworks.section3;


import cn.school.thoughtworks.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collectionB) {
        List<String> value = new ArrayList<>();
        collectionB.entrySet().forEach(s -> value.addAll(s.getValue()));
        Helper helper = new Helper();
        return helper.GetSameElementSizeDividedByThree(collectionA, value);
    }


}
