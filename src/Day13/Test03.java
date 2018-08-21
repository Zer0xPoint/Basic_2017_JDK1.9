package Day13;

import java.util.ArrayList;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<String> stringArrayList = new ArrayList<>();
            stringArrayList.add("小" + (char) (i + 65));
            stringArrayList.add("0");
            arrayLists.add(stringArrayList);
        }
        for (int i = 0; i < 5; i++) {
            int choice = new Random().nextInt(7);
            if (choice <= arrayLists.size() && choice > 0) {
                choice -= 1;
                int vote = Integer.parseInt(arrayLists.get(choice).get(1)) + 1;
                arrayLists.get(choice).set(1, vote + "");
                System.out.println("投给了" + arrayLists.get(choice).get(0));
            } else {
                System.out.println("没有这个人");
            }
        }
        int max = 0;
        String classMonitor = "";
        for (ArrayList<String> arrayList : arrayLists) {
            int vote = Integer.parseInt(arrayList.get(1));
            max = (vote > max) ? vote : max;
            classMonitor = (vote == max) ? arrayList.get(0) : classMonitor;
        }

        System.out.println(arrayLists);
        System.out.println("班长是" + classMonitor+ "一共" + max + "票");
    }
}
