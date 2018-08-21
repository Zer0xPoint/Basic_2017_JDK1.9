package Day12;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = i * 2 - 1;
        int count = 1;
        while (j >= 0) {
            for (int k = 0; k <= (i - count) / 2; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (j > i) {
                count += 2;
            } else {
                count -= 2;
            }
            j -= 1;
        }
    }
}
