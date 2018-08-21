package Day25;

import java.util.HashSet;
/*
*hashSet结构 底层依赖hashCode和equals方法
*应该重写这两个方法
*
* 可以保证元素唯一性 并且速度较快（查字典）
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Dog> dogs  = new HashSet<>(){
            {
                Dog dog = new Dog("秦桧","red","男",12);
                Dog dog1 = new Dog("秦桧","red","男",12);
                Dog dog2 = new Dog("高俅","black","男",25);
                Dog dog3 = new Dog("秦桧","red","女",12);
                Dog dog4 = new Dog("魏忠贤","red","男",20);
                Dog dog5 = new Dog("李莲英","write","男",23);
                Dog dog6 = new Dog("李莲英","write","男",23);

                add(dog);
                add(dog1);
                add(dog2);
                add(dog3);
                add(dog4);
                add(dog5);
                add(dog6);
            }
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
