package Day08;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) throws IOException {
        String[] strings = {"Hello", "World", "java"};
        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day08/TestFile01");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String string : strings) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day08/TestFile01");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
