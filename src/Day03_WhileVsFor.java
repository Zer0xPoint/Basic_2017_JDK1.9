public class Day03_WhileVsFor {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i <= 10) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            i += 1; // 会被Continue跳过 导致while死循环
        }
    }
}