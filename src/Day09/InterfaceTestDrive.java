package Day09;

public class InterfaceTestDrive {
    public static void main(String[] args) {

        //接口名
        Animal cat = new Cat();
        Animal dog = new Dog();

//        cat.eat();
//        cat.sleep();
//        dog.eat();
//        dog.sleep();

        method(cat);
        method(dog);
    }

    static void method(Animal animal) { //使用接口作为参数类型，不用区分是猫还是狗
        animal.eat();
        animal.sleep();//只能使用接口定义的方法
        //无法调用其他类的专用方法
    }
}
