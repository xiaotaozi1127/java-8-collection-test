package cn.school.thoughtworks.section2;

import cn.school.thoughtworks.Helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Helper helper = new Helper();
        return helper.GetElementSize(collection1);
    }
}
