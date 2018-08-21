package Day10;

public class StaticVSInstance {
    /*
    Static 和 没有Static有什么区别
    public static 返回值 方法名（）
    public 返回值 方法名（）

    调用static方法的格式
    方法名（）
    类名称.方法名（）

    调用成员方法的格式
    类名称 对象名 = new 类名称（）「构造函数」
    对象名.成员方法名（）

    1，如果不创建对象，只能调用静态方法
    2，如果创建了对象，用过对象名可以调用成员方法
    3，通过对象名也可以调用静态方法，但是不推荐
     */
    public static void main(String[] args) {
        /*
        调用静态方法
         */
        method1();
        StaticVSInstance.method1();
        StaticVSInstanceTestClass.method2();
        /*
        调用成员方法
         */
        StaticVSInstanceTestClass staticVSInstanceTestClass = new StaticVSInstanceTestClass();
        staticVSInstanceTestClass.method3();
    }

    static void method1() {
        System.out.println("Static method1");
    }
}
