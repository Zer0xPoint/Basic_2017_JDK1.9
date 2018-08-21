package Day25;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 基于TreeMap
 * 排序 唯一
 *
 * 排序：
 * 自然排序 （元素具备比较性） 让元素四号线自然排序接口 Comparable
 * 比较器排序 （集合具备比较性） 让集合的构造方法接受一个比较器接口的子类对象 Comparator
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Dog> dogs = new TreeSet<>(new Comparator<Dog>() { //使用匿名内部类
            @Override
            public int compare(Dog o1, Dog o2) {//调用比较器排序 默认使用自然排序
                // 比较器排序
                int num = o1.getName().length() - o2.getName().length();
                int num1 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                int num2 = num1 == 0 ? o1.getAge() - o2.getAge() : num1;
                int num3 = num2 == 0 ? o1.getColor().compareTo(o2.getColor()) : num2;
                int num4 = num3 == 0 ? o1.getGender().compareTo(o2.getGender()) : num3;
                return num4;
            }
        }) {
            {
                Dog dog = new Dog("秦桧", "red", "男", 13);
                Dog dog1 = new Dog("秦桧", "red", "男", 14);
                Dog dog2 = new Dog("高俅", "black", "男", 25);
                Dog dog3 = new Dog("秦桧", "red", "男", 13);
                Dog dog4 = new Dog("魏忠贤", "red", "男", 14);
                Dog dog5 = new Dog("李莲英", "write", "男", 23);
                Dog dog6 = new Dog("李莲英", "write", "男", 23);
                Dog dog7 = new Dog("秦桧", "red", "男", 13);


                add(dog);
                add(dog1);
                add(dog2);
                add(dog3);
                add(dog4);
                add(dog5);
                add(dog6);
                add(dog7);
            }
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
