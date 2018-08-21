package Day09;

public interface Animal {
    /*
    接口
    1，通用性 都当做一种类型对待
    2，隔离性 特有功能不关心，只关心接口相关功能

    接口当中可以包含的组成部分
    1，抽象方法 *
    2，常量
    3，默认方法 JDK1.8
    4，静态方法 JDK1.8
    5，私有方法 JDK1.9

    如何定义一个抽象类型
    1，public abstract 返回值类型 方法名称（）；不能有方法体
    2，一定的修饰符public abstract 可以不用写，默认生成
     */

    void doSomeThing(); //1
    void doSomeThinglse(); //2
    void eat();
    void sleep();
}
