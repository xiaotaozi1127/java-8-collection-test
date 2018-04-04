package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.Helper;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Helper helper = new Helper();
        return helper.GetElementSizeWithDash(collection1);
    }
}
