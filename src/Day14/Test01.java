package Day14;

public class Test01 {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }
}

class Test01TestDrive {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.addition(1, 2));
        System.out.println(test01.division(1, 2));
        System.out.println(test01.multiplication(1, 2));
        System.out.println(test01.subtraction(1, 2));
    }
}