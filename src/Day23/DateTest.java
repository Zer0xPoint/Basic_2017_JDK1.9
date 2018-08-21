package Day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String birthdate = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birthdate);

        long birthTime = date.getTime();
        long currTime = System.currentTimeMillis();
        int age = (int) ((currTime - birthTime)/1000/60/60/24/365);

        System.out.println(age);
    }
}
