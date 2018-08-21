package Day10;

import java.util.ArrayList;

public class StreamMap {
    /*
    获取Stream之后 可以使用映射方法，map（Lambda表达式）
    作用是讲一个对象转换成为另一个对象，把老对象映射到新对象上
     */
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Lin,000");
        stringArrayList.add("Lee,001");

        stringArrayList.stream().map(s -> {
            String[] strings = s.split(",");
            String s1 = strings[1];
            return s1;
        });

        stringArrayList.stream().map(s -> s.split("1")[1]);
    }
}
