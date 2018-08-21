package Day16;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        double res = 0;
        if (i % 2 != 0) {
            res = evenAdd(i);
        } else {
            res = oddAdd(i);
        }
        System.out.println("结果是" + res);
    }

    static double evenAdd(int i) {
        System.out.println("奇数");
        double res = 0;
        while (i >= 1) {
            res += 1.0 / i;
            i -= 1;
        }
        return res;
    }

    static double oddAdd(int i) {
        System.out.println("偶数");
        double res = 0;
        while (i >= 2) {
            res += 1.0 / i;
            i -= 1;
        }
        return res;
    }
}
