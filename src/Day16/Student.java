package Day16;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();
        if (validate(score)) convert(score);
        else System.out.println("分数无效");
    }

    static boolean validate(int score) {
        return score > 0 && score <= 100;
    }

    static void convert(int score) {
        String scoreClass;
        if (score >= 90) scoreClass = "A";
        else if (score >= 80) scoreClass = "B";
        else if (score >= 70) scoreClass = "C";
        else if (score >= 60) scoreClass = "D";
        else scoreClass = "X";
        System.out.println("分数为：" + score + " 是第" + scoreClass + "等级");
    }
}
