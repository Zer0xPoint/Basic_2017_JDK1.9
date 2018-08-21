package Day19;

import Day18.Polymorphism;

import java.util.Objects;

/*
直接输出对象，默认调用toString（）方法
equals和==
基本类型比较值
引用类型比较地址
 */

public class EqualsTest implements Cloneable{//标记接口 使类可以克隆
    private int age;
    private String name;

    public EqualsTest() {
    }

    public EqualsTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //判断对象地址是否相同
        if (!(o instanceof EqualsTest)) return false;// 判断对象是否属于同一个类
        EqualsTest that = (EqualsTest) o;//向下转型 obj 转 本类
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName()); //判断成员变量是否相等
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

class EqualsTestDrive {
    public static void main(String[] args) throws Throwable {
        EqualsTest equalsTest = new EqualsTest();
        EqualsTest equalsTest1 = new EqualsTest();

        Polymorphism polymorphism = new Polymorphism();

        System.out.println(equalsTest.equals(polymorphism));
        System.out.println(equalsTest.equals(equalsTest1));

        Object equalsTest2 = equalsTest.clone();
        EqualsTest equalsTest2Clone = (EqualsTest) equalsTest2;//实现浅克隆 其实是新建了一个对象

        equalsTest2Clone.hashCode();
        equalsTest2Clone.finalize();//已经在9中被丢弃
        equalsTest2Clone.getClass();//返回对象字节码文件 在反射中讲解
    }
}
