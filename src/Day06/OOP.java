package Day06;

public class OOP {
    /*
    面向过程：看中每一股步骤怎么做
    面向对象：不看重过程，关心谁能帮我做
    1，封装性
    2，多态性
    3，继承性
    */

    private int a;// 不用给赋值 默认为0

    public static void main(String[] args) {
        int a = 0;// 必须赋值
        ClassTest someClass = new ClassTest(); //前面是类名 + 对象名 = new + 构造方法名
        someClass.printHello();
        System.out.println(someClass.className);
        System.out.println(someClass.classUsage);

        someClass.setPrivInt(20);
        System.out.println(someClass.getPrivInt());

        someClass.setPrivInt(-20);
        System.out.println(someClass.getPrivInt());

    }

    /*
    什么是"标准Java类" POJO
    Plain Old Java Object
    1，所有成员变量都要使用private关键字私有化
    2，给每一个成员变量编写一对Getter Setter
    3，编写一个无参构造函数
    4，编写一个全参数构造函数
     */

}

