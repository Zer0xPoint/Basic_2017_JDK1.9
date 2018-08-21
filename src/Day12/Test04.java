package Day12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Stream.of(s).map(s1 -> s1.split("")).flatMap(Arrays::stream).forEach(System.out::print);
    }
}