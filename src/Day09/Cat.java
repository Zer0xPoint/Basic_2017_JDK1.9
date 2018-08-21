package Day09;

public class Cat implements Animal {
    /*
    如果要实现一个接口，必须要有一个实现类
    类中必须重写接口中的抽象方法

    调用的时候看左边
    运行的时候看右边
    */

    public static void main(String[] args) {
        Animal animal = new Cat();//实例化
        animal.eat();//调用方法 运行时
        /*animal.catchMouse();*///错误，只能调用接口方法 隔离
        ((Cat) animal).catchMouse();
    }

    @Override
    public void doSomeThing() {

    }

    @Override
    public void doSomeThinglse() {

    }

    @Override
    public void eat() {
        System.out.println("喵吃鱼");

    }

    @Override
    public void sleep() {
        System.out.println("喵睡觉");


    }

    public void catchMouse() {
        //类特有的方法 接口中并没有
        System.out.println("Test");
    }

}
