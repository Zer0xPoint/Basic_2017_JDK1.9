package Day25;

import java.util.Objects;

public class Dog implements Comparable<Dog> {//想要使用compareTo 必须实现Comparable<Dog>接口
    private String name, color, gender;
    private int age;

    public Dog(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(gender, dog.gender);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, gender, age);
    }


    @Override
    public int compareTo(Dog o) { // 自然排序
        //次要条件 判断其他元素是否相等
        int num = this.getName().length() - o.getName().length();
        int num1 = num == 0 ? this.getName().compareTo(o.getName()) : num;
        int num2 = num1 == 0 ? this.getAge() - o.getAge() : num1;
        int num3 = num2 == 0 ? this.getColor().compareTo(o.getColor()) : num2;
        int num4 = num3 == 0 ? this.getGender().compareTo(o.getGender()) : num3;
        return num4;
    }
}
