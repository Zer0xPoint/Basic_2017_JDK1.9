package Day10;

import java.util.Scanner;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        runGetAbs((i) -> (i < 0)? -i : i);

        runGetAbs(MethodReferenceTest01::MethodReferenceGetAbs);
        runGetAbs(Math::abs);//类名：静态方法名

        MethodReferenceTest01 methodReferenceTest01 = new MethodReferenceTest01();
        runGetAbs(methodReferenceTest01::InstanceMethodReferenceGetAbs);//对象名：对象方法名
    }

    static int MethodReferenceGetAbs(int i) {
        return (i < 0)? -i : i;
    }

    int InstanceMethodReferenceGetAbs(int i) {
        return (i < 0)? -i : i;
    }

    static void runGetAbs(MethodReferenceInterfaceTest01 methodReferenceInterfaceTest01) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(methodReferenceInterfaceTest01.getAbs(i));
    }

}
