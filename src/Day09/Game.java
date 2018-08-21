package Day09;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        /*
        1，创建集合，存储5个实体
        2，读取文件，将数据加载到集合当中
        3，判断集合是不是空的
        4，判断集合是不是新的
         */
        ArrayList<Gamer> gamers = new ArrayList<>();

        System.out.println("loading gamers to ArrayList");
        loadGamersInfoFromFile(gamers);

        boolean isNew = gamers.isEmpty();

        if (isNew) {
            System.out.println("How many gamers you want to play with?");
            Scanner scanner = new Scanner(System.in);
            int gamesQuantity = Integer.parseInt(scanner.next());
            for (int i = 0; i < gamesQuantity; i++) {
                addGamers(gamers);
            }
        }

        System.out.println("gamers name:");
        displayGamersInfo(gamers);

        int totalLevel = getGamersTotalLevel(gamers);
        System.out.println("total level " + totalLevel);

        if (isNew) {
            System.out.println("save ArrayList to File");
            saveGamersInfoToFile(gamers);
        }

        System.out.println("end");
    }

    private static void addGamers(ArrayList<Gamer> gamers) {//把实体放入集合中
        String name = generateNewGamerName();
        int level = generateNewLevel();
        Gamer gamer = new Gamer(name, level);
        gamers.add(gamer);
    }

    private static String generateNewGamerName() {//随机计算英文名字
        StringBuilder name = new StringBuilder();
        Random randomTimes = new Random();
        for (int i = 0; i < randomTimes.nextInt(13) + 5; i++) {
            if (i == 0) {
                name.append((char) (randomTimes.nextInt(26) + 65));//首字母大写
            }
            name.append((char) (randomTimes.nextInt(26) + 97));
        }
        return name.toString();
    }

    private static int generateNewLevel() {//随机计算等级
        Random randomLevels = new Random();
        return randomLevels.nextInt(100);
    }

    private static void displayGamersInfo(ArrayList<Gamer> gamers) {
        for (Gamer gamer : gamers) {
            System.out.println(gamer.getName());
            System.out.println(gamer.getLevel());
        }
    }

    private static int getGamersTotalLevel(ArrayList<Gamer> gamers) {
        int tolalLevel = 0;
        for (Gamer gamer : gamers) {
            tolalLevel += gamer.getLevel();
        }
        return tolalLevel;
    }

    private static void saveGamersInfoToFile(ArrayList<Gamer> gamers) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day09/GamersArrayList");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Gamer gamer : gamers) {
            //需要将一个对象转换为字符串，可以将两个成员变量拼接成为一个字符串
            String info = gamer.getName() + "," + gamer.getLevel();
            bufferedWriter.newLine();//换行
            bufferedWriter.write(info);
        }
        bufferedWriter.close();
    }

    private static void loadGamersInfoFromFile(ArrayList<Gamer> gamers) throws IOException {
        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day09/GamersArrayList");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] info;
            info = line.split(",");
            Gamer gamer = new Gamer(info[0], Integer.parseInt(info[1]));
            gamers.add(gamer);
        }

        bufferedReader.close();
    }
}
