import java.lang.reflect.Array;
import java.util.Scanner;

public class Day05_Method {
    public static void main(String[] args) {
        /*
        重载：
        1，参数个数
        2，参数类型
        3，参数类型排列

        1，参数名称
        2，方法返回值
         */
        System.out.println(sum(5, 7));
        System.out.println(sum(4.5, 5));

        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[2];

        for(int i = 0; i < 2; i ++) {
            intArray[i] = Integer.parseInt(scanner.next());
        }

        System.out.println(getMaxInt(intArray));

        int[] ints = {1,2,3,4,5};
        printArray(ints);

        /*
        1，基本数据类型（包括String）不会影响实际参数
        2，引用数据类型（除了String）会 影响实际参数：（array等）
         */


    }

    public static void printArray(int[] ints) {

        System.out.print("[");
        for (int i = 0; i < ints.length; i ++) {
            // 快速遍历iter快捷键
            if (i == ints.length - 1) {
                System.out.print(ints[i] + "]");
            }
            else {
                System.out.print(ints[i] + ", ");
            }
        }
    }

    public static int getMaxInt(int[] array){
        int max = array[0];
        for (int num: array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int sum(int x, int y) {
        System.out.println("int");
        return x + y;
    }
    public static double sum(double x, double y) {
        System.out.println("double");
        return x + y;
    }
}
