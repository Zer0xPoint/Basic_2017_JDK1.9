package Day21;
/*
如果在-128 127范围内 不创建新空间
 */
public class IntegerTest {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.toOctalString(100));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //10进制整数转为目标进制字符串
        System.out.println(Integer.toString(100, 36));//最大 26个字母+10个数字表示36进制
        System.out.println(Integer.toString(100, 2));//最小

        //由目标进制字符串转为10进制整数
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("1101101", 2));
        System.out.println(Integer.parseInt("4f", 16));
        //System.out.println(Integer.parseInt("123",2)); 不符合2进制数进行转换 会出错
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); //true
        System.out.println(i1.equals(i2));
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4); //false
        System.out.println(i3.equals(i4));
        //对处于-128到127之间的数据 创建一个数据缓冲池 如果不属于该范围 创建新空间

    }
}
