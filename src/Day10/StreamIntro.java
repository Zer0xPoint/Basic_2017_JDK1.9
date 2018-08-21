package Day10;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
Stream是一个Java 8提供的接口
JDK提供了一个Stream接口 java.util.stream.Stream<T>
 */
public class StreamIntro {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "java"};
        Stream<String> stringStream = Stream.of(strings);

        //若不是引用类型
        Integer[] integers = {1, 2, 3};
        Stream<Integer> integerStream = Stream.of(integers);
    }
}
