package Day06;

public class Human {
    private String name;
    private int age;

    public Human() {}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + " I'm " + this.name + " ,I'm " + this.age + " years old.");
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
}
