package Day13;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {

        int[][] scores = new int[4][3];

        String[] courses = {"HTML", "Java", "MySQL", "JavaScript"};
        String[] names = {"Mary", "Tom", "Bruce"};

        double[] course_average = new double[4];
        double[] name_average = new double[3];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = new Random().nextInt(100);
                System.out.println("输入" + names[j] + "的" + courses[i] + "成绩为 " + scores[i][j]);
                course_average[i] += scores[i][j];
                name_average[j] += scores[i][j];
            }
        }

        for (int i = 0; i < course_average.length; i++) {
            System.out.println(courses[i] + " 的平均成绩是 " + course_average[i] / name_average.length);
        }
        for (int i = 0; i < name_average.length; i++) {
            System.out.println(names[i] + " 的平均成绩是 " + name_average[i] / course_average.length);
        }
    }
}
