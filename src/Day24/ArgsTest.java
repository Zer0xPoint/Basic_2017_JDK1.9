package Day24;

public class ArgsTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        getSum(a, b, c, d);
    }

    static void getSum(int... a) { //可变参数 其实是数组
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}
