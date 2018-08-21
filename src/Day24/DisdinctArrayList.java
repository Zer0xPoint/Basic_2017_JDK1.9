package Day24;

import org.springframework.util.StopWatch;

import java.util.*;

public class DisdinctArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>() {
            {
                for (int i = 0; i < 1000; i++) {
                    add(i + "");
                }
                add(1 + "");
                add(2 + "");
                add(3 + "");
            }
        };

        System.out.println(useFor(strings)); // On2
        System.out.println(useContains(strings)); //On2
        System.out.println(useSet(strings)); //On
    }

    static List useFor(ArrayList strings) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        List strings1 = new LinkedList(strings);
//        List removeIndex = new LinkedList();
        for (int i = 0; i < strings1.size(); i++) {
            for (int j = i + 1; j < strings1.size(); j++) {
                if (strings1.get(i).equals(strings1.get(j))) {
                    strings1.remove(j);
                    j -= 1; // 回到刚才的位置 防止跳过元素
//                    removeIndex.add(j);
                }
            }
        }
//        for (Object index : removeIndex) {
//            strings1.remove(index);
//        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
        return strings1;

    }

    static ArrayList useContains(ArrayList strings) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ArrayList strings1 = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!strings1.contains(strings.get(i))) {
                strings1.add(strings.get(i));
            }
        }

        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
        return strings1;
    }

    static ArrayList useSet(ArrayList strings) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Set set = new HashSet(strings);
        ArrayList strings1 = new ArrayList(set);

        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
        return strings1;
    }

}
