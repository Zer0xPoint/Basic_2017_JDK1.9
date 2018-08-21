package Day15;

public class Test01 {
    public static void main(String[] args) {
        System.out.print(mystery(2,25));
        System.out.print(mystery(3,11));
    }

    static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
}
