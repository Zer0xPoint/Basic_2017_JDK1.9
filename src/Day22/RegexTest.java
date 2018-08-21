package Day22;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
正则表达式的规则

字符本身
\\反斜杠
\n新行
\r回车

[abc]
[^abc]否定
[a-zA-Z]范围
[0-9]数字

. 任何
\d 数字
\D 非数字
\s 空白字符
\S 非空白字符
\w 单词字符 [a-zA-Z_0-9]
\W 非单词字符

^ 开始
$ 结尾
\b 单词边界 （不是单词字符的地方）除了[a-zA-Z 0-9]的地方

数量词
? 0 or 1
* 0 or 多
+ 1 or 多
n 刚好n次
n， 至少n次
n-m 至少n 但不超过m
没有给定 1次

正则表达式的应用

判断 String类下的 matches（String regex）
判断手机号码
判断邮箱

 */
public class RegexTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String qq = scanner.nextLine();
        String qq = "499152450";
        System.out.println(checkQQ(qq));

//        String phoneNumber = scanner.nextLine();
        String phoneNumber = "15545958123";
        System.out.println(checkPhoneNum(phoneNumber));

        String mailAddress = "liyizhou@me.com";
        System.out.println(checkmailAddress(mailAddress));

        String nums = "91 23 13 40 51";
        System.out.println(sortString(nums));

        String replaceStr = "asd123asd123asdasd";
        System.out.println(replaceAllNums(replaceStr));

        String matchStr = "asl diwa s Hello World";
        regexPattern(matchStr);
    }

    static boolean checkQQ(String qq) {
//        return qq.matches("[1-9][0-9]{4,14}"); //第一个是1-9 之后有4-14个数字字符
        return qq.matches("[1-9]\\d{0,14}");
    }

    static boolean checkPhoneNum(String phoneNumber) {
        return phoneNumber.matches("[1][3-9]\\d{9}");
    }

    static boolean checkmailAddress(String mailAddress) {
//        return mailAddress.matches("\\w+@\\w{2,6}(\\.\\w{2,3})+");//[a-zA-Z_0-9]用\\w代替
        return mailAddress.matches("^\\s*\\w+(?:\\.?[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$");
    }

    static StringBuffer sortString(String s) {
        String[] strings = s.split(" ");
        int[] integers = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(integers);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < integers.length; i++) {
            stringBuffer.append(integers[i]).append(" ");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer;
    }

    static String replaceAllNums(String s) {
        return s.replaceAll("\\d+", "*");
    }

    static void regexPattern(String s) {
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b");
        Matcher matcher =pattern.matcher(s);
        //通过find方法查找有没有满足条件的子序列
//        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
