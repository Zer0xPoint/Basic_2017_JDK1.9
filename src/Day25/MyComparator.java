package Day25;

import java.util.Comparator;

public class MyComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) { // 比较器排序
        int num = o1.getName().length() - o2.getName().length();
        int num1 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
        int num2 = num1 == 0 ? o1.getAge() - o2.getAge() : num1;
        int num3 = num2 == 0 ? o1.getColor().compareTo(o2.getColor()) : num2;
        int num4 = num3 == 0 ? o1.getGender().compareTo(o2.getGender()) : num3;
        return num4;
    }
}
