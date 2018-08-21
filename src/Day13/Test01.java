package Day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            char ic = (char)(i + 65);
            stringArrayList.add(ic + "果");
        }
        int choice = new Scanner(System.in).nextInt();
        if (choice <= stringArrayList.size() && choice > 0) {
            System.out.println(stringArrayList.get(choice - 1));
        } else {
            System.out.println("数组越界");
        }
    }
}
