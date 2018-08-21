package Day25;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 *获取10个随机数 不能有重复
 */
public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < 10) {
            int i = random.nextInt(20) + 1;
            integers.add(i);
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
