package Day10;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest01 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Lee,100");
        stringArrayList.add("Lin,199");

        stringArrayList.stream().map(s -> s.split(",")[1]).map(Integer::parseInt).filter(i -> i > 100).forEach(System.out::println);

        Stream<String> stream = stringArrayList.stream();
        //数组中的数据必须为引用类型

        String[] strings = {"hello", "world", "java"};
        Stream<String> stringStream = Stream.of(strings);

        //若不是引用类型
        Integer[] integers = {1,2,3};
        Stream<Integer> integerStream = Stream.of(integers);

    }
}
