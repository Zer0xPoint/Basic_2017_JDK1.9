package Day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>() {
            {
                add("9");
                add("0");
                for (int i = 0; i < 9; i++) {
                    add(i + "");
                }
            }
        };
        Set<String> strings1 = new TreeSet<>(strings);//将list添加到set中，去重
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
