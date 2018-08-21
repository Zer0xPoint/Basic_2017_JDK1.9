package Day06;

public class HumanTestDrive {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("Lee");

        Human human2 = new Human("Lin", 18);

        human1.sayHello(human2.getName());
        human2.sayHello(human1.getName());

    }
}
