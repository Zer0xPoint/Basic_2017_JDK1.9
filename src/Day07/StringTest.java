package Day07;

public class StringTest {
    /*
    String是一种引用类型
    是要是String 就是一个对象
    直接打印的String 依然是一个对象

    为什么不需要导入包
    1，在同一个文件夹下
    2，在Java.lang（language）下的都不需要导入，但不包含子包内容

    为什么String打印出来直接是内容而不是地址
    1，如果是String类型，那么直接打印
    2，如果是其他，转换为String，再打印
    3，一般对象都是使用 类型信息 + @ + 地址值 作为字符串内容

     */

    public static void main(java.lang.String[] args) {
        constructString();
        System.out.println("*********************");
        stringPool();
        System.out.println("*********************");
        stringEternal();
        System.out.println("*********************");

    }

    public static void constructString() {
        System.out.println("Hello World");

        /*
        新建String的2 + 1种方法®
         */
        char[] chars = {'h' ,'e', 'l', 'l', 'o'};

        java.lang.String string = new java.lang.String(chars);
        System.out.println(string);

        java.lang.String string1 = new java.lang.String(chars, 2, 3);
        System.out.println(string1);

        java.lang.String string2 = "Hello";
        System.out.println(string2);

    }

    public static void stringPool() {
        /*
        为了节省内存，引入一个 内存池，可以重复利用字符串
        1，字符串是位于 堆 中的空间，保存若干个字符串的地址值
        2，池中不会出现重复的字符串对应的地址，保证字符串不重复
        3，凡是直接String str = "sth"的字符串默认都在池中，而new出来的默认不在池中
         */

        java.lang.String string0 = "1";
        java.lang.String string1 = "1";
        System.out.println(string0 == string1);//内容相同 在池中同一个地址中

        java.lang.String string2 = new java.lang.String("2");
        java.lang.String string3 = new java.lang.String("2");
        System.out.println(string2 == string3);//new出来 不管内容 在堆中全新创建一个地址
    }

    public static void stringEternal() {
        /*
        字符串在内存中一旦创建，内容不能被更改
        改变的是地址值，在堆中的字符串内容是不会改变的
         */
        java.lang.String string = "Hello";//在堆中新建了一个"Hello"，将地址给池，然后在给string
        System.out.println(string);

        string = "World";//在堆中 新 创建了一个"World"，将地址给池，然后将新的地址给string
        System.out.println(string);

        java.lang.String string1 = "Love";//1
        string1 += "Java";//2
        System.out.println(string1);//3 共创建3个字符串

    }



}
