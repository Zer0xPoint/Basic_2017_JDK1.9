package Day25;

import java.util.LinkedHashSet;

/*
 * 特殊： 有序
 *
 * 底层由hash表和linked表组成
 * 唯一         有序
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>() {
            {
                add("hello");
                add("world");
                add("java");//唯一
                add("java");
            }
        };
        for (String string : strings) {
            System.out.println(string);//有序
        }
    }
}
