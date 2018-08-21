package Day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IOTest02 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();
        FileReader fileReader = new FileReader("src/Day08/TestFile02");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;

        while ((string = bufferedReader.readLine()) != null) {
            stringArrayList.add(string);
        }

        for (int i = stringArrayList.size() - 1; i >= 0; i--) {
            System.out.println(stringArrayList.get(i).substring(0,1));
        }

        bufferedReader.close();
    }
}
