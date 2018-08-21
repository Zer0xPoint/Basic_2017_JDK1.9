package Day12;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sum = 0;
        if (i % 2 != 0) {
            i -= 1;
        }
        while (i >= 0) {
            sum += i * i;
            i -= 2;
        }

        System.out.println(sum);
    }
}
