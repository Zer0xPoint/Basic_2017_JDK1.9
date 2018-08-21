package Day20;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        printList(list);
    }
    static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
