package Day20;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int phoneNum = Integer.parseInt(scanner.nextLine());
            map.put(name, phoneNum);
            System.out.println("继续？y/n");
            if (scanner.nextLine().equals("n")) break;
        }
        TreeMap<String, Integer> sortMap = (TreeMap<String, Integer>) sortMapByKey(map);
        for (Map.Entry<String, Integer> stringIntegerEntry : sortMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }
        String name;
        if (sortMap.containsKey(name = new Scanner(System.in).nextLine())) {
            System.out.println(sortMap.get(name));
        } else {
            System.out.println("没有这个人");
        }
    }

    public static Map<String, Integer> sortMapByKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap<String, Integer> sortMap = new TreeMap<>();
        sortMap.putAll(map);
        return sortMap;
    }
}