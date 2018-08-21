package Day10;

import java.util.ArrayList;

public class Parallel {
    /*
    对Stream中的元素，同时处理，叫做并行
     */
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringArrayList.add("Hello" + i);
        }
        //串行
        stringArrayList.forEach(System.out::println);

        //并行
        stringArrayList.parallelStream().forEach(System.out::println);

    }
}
