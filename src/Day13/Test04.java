package Day13;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (integers.size() < 7) {
            int randomInt = new Random().nextInt(33);
            if (!integers.contains(randomInt)) {
                if (integers.size() == 6) {
                    int randomInt1 = new Random().nextInt(16);
                    integers.add(randomInt1);
                } else {
                    integers.add(randomInt);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("红号: ");
        for (int i = 0; i < integers.size(); i++) {
            if (i < integers.size() - 1) {
                stringBuilder.append(integers.get(i)).append(" ");
            } else {
                stringBuilder.append("蓝号: ");
                stringBuilder.append(integers.get(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
