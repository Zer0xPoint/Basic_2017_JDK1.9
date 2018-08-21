package Day11;

import java.util.ArrayList;
import java.util.Scanner;

/*
倒序
加上5，余10
第一位和最后一位交换
 */
public class EncryptionTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split("");
        encryption(s);

    }
    static void encryption(String[] s) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = s.length - 1; i >= 0; i--) {
            integers.add((Integer.parseInt(s[i]) + 5) % 10);
        }

        int temp = integers.get(0);
        integers.set(0, integers.get(integers.size() - 1));
        integers.set(integers.size() - 1, temp);

        for (Integer integer : integers) {
            System.out.print(integer);
        }
    }
}
