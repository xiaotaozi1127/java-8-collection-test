package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collectionB) {
        Helper helper = new Helper();
        Map<String, Integer> collection3 = helper.GetElementSize(collectionA);

        List<String> keys = new ArrayList<>();
        collectionB.entrySet().forEach(s -> keys.addAll(s.getValue()));

        return helper.GetSameElementSizeDividedByThree(collection3, keys);
    }
}
