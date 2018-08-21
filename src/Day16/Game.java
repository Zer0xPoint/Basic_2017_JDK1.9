package Day16;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        compare(user(), computer());
    }
    static int user(){
        while (true) {
            int minino = new Scanner(System.in).nextInt();
            if (minino < 4 && minino > 0) {
                return minino;
            }
            System.out.println("请输入1-3之间的整数");
        }

    }
    static int computer(){
        return new Random().nextInt(3) + 1;
    }
    static void compare(int user, int computer){
        String[] strings = {"石头","剪刀","布"};
        int res = user - computer;
        System.out.println(strings[user - 1]+" "+ strings[computer - 1]);
        if (res == 1 || res == -2) {
            System.out.println("你输了");
        }
        else if (res == 0) System.out.println("平局");
        else System.out.println("你获胜了");
    }
}
