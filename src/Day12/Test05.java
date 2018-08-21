package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int i = scanner.nextInt();
        int index = 0;
        while (index < i) {
            if (index > 1) {
                integers.add(integers.get(index - 2) + integers.get(index - 1));
            } else {
                integers.add(1);
            }
            index += 1;
        }
        System.out.println(integers);
    }
}
