package Day12;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double sum = 0;
        while (i > 0) {
            sum += 1.0 / i;
            i -= 2;
        }
        System.out.println(sum);
    }
}
