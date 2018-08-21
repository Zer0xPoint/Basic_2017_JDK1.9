package Day10;


import java.util.Scanner;

public class MonitorClass {
    public static void main(String[] args) {

        runDisplay(System.out::println);

    }
    static void runDisplay(MonitorInterface monitorInterface) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        monitorInterface.display(string);
    }
}
