package cn.school.thoughtworks.section3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeDTest {
    private PracticeD practiceD = null;

    @Before
    public void setUp() throws Exception {
        practiceD = new PracticeD();
    }

    @Test
    public void create_update_collection_should_return_a_new_map_with_element_as_key_and_count_as_value() throws Exception {
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h",
                "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c", "c", "c", "c", "c", "c", "c", "c",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d-5"
        );

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String, List<String>> collection2 = new HashMap<>();
        collection2.put("value", list);

        Map<String, Integer> result = practiceD.createUpdatedCollection(collection1, collection2);
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 2);
            put("e", 5);
            put("h", 11);
            put("t", 20);
            put("f", 6);
            put("c", 8);
            put("g", 7);
            put("b", 6);
            put("d", 4);
        }};

        assertEquals(result, expectedResult);
    }
}
