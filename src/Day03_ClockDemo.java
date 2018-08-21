public class Day03_ClockDemo {

    public static void main(String[] args) {
        for(int i = 0; i <= 23; i ++) {
            for (int j = 0; j <= 59; j ++) {
                System.out.println(i + "时" + j + "分");
            }
        }
    }
}