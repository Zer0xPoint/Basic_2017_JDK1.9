package Day17;

import java.util.Scanner;

public class Child extends Person {
    private String kinderGarten;

    public Child(String kinderGarten) {
        this.kinderGarten = kinderGarten;
    }

    public Child(String name, String sex, int age, String kinderGarten) {
        super(name, sex, age);
        this.kinderGarten = kinderGarten;
    }

    public void game() {
        System.out.println("小朋友正在玩" + new Scanner(System.in).nextLine() + "游戏");
    }
}
