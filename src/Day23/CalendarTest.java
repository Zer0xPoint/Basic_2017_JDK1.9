package Day23;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();// 抽象类 返回日历对象

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);

        System.out.println(year + "" + (month + 1) + "" + date);//month从0开始 需要加1
    }
}
