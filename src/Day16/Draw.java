package Day16;

public class Draw {
    public static void main(String[] args) {
        System.out.print("面积为" + calculateArea(3, 3, 3));
    }

    private static double calculateArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
