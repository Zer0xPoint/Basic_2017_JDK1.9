package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {

        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Arrays.stream(ints).flatMapToInt(Arrays::stream).reduce((left, right) -> left + right).stream().forEach(System.out::println);

        int sum = 0;
        for (int[] anInt : ints) {
            for (int i : anInt) {
                sum += i;
            }
        }
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int[][] ints1 = new int[lines][lines];
        ints1[0][0] = 1;

        for (int i = 0; i < ints1.length; i++) {
            for (int j = i; j > 0; j--) {
                ints1[i][j] = ints1[i - 1][j] + ints1[i - 1][j - 1];
                System.out.print(ints1[i][j] + " ");

            }
            System.out.println();
        }

    }
}
