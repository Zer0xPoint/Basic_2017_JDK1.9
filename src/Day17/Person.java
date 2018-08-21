package Day17;

import java.util.Scanner;

public class Person {
    private String name, sex;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void shwo() {
        System.out.println(this.name + this.age + this.sex);
    }
}

class PersonTestDrive {
    public static void main(String[] args) {
        Child child = new Child("lin","female",1,"石头剪刀布");
        Student student = new Student("lee","male",2,"数学");
        child.game();
        String subject = new Scanner(System.in).nextLine();
        student.study(subject);
    }
}