package Day25;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *存储学生信息 按照总分从高到输出
 */
public class Test02 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSumScore() - o1.getSumScore();//o1 o2 交换位置即可实现从高到低
                int num1 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                int num2 = num1 == 0 ? o1.getChnScore() - o2.getChnScore() : num1;
                int num3 = num2 == 0 ? o1.getEngScore() - o2.getEngScore() : num2;
                return num3 == 0 ? o1.getMathScore() - o2.getMathScore() : num3;
            }
        }) {
            {
                Student student = new Student("1", 1, 2, 3);
                Student student1 = new Student("2", 12, 25, 38);
                Student student2 = new Student("3", 11, 22, 31);
                Student student3 = new Student("4", 13, 27, 32);
                Student student4 = new Student("5", 14, 21, 34);

                add(student);
                add(student1);
                add(student2);
                add(student3);
                add(student4);
            }
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
