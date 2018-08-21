package Day17;

import java.util.Scanner;

public class Student extends Person{
    private String stuClass;

    public Student(String stuClass) {
        this.stuClass = stuClass;
    }

    public Student(String name, String sex, int age, String stuClass) {
        super(name, sex, age);
        this.stuClass = stuClass;
    }
    public void study(String subject) {
        System.out.println("学生正在学" + subject);
    }
}
