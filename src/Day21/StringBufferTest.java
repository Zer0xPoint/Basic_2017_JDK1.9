package Day21;
/*
StringBuffer String 线程安全 同步 数据安全 银行，医院等
StringBuilder 不安全 不同步 不安全但是效率高 新闻网站等
同时取钱，买票问题

StringBuffer 线程安全的可变字符串
String 不可变
如果使用StringBuffer做字符串拼接，不会浪费太多空间

形式参数问题
String和基本类型一样，作为形式参数不影响实际参数
StringBuffer调用方法时 ，影响实际参数

StringBuffer转String
toString方法

String转StringBuffer
构造方法
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuffer stringBuffer1 = new StringBuffer("World");
        System.out.println(stringBuffer.capacity());//总容量
        System.out.println(stringBuffer.length());//内容长度
//        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        change(stringBuffer,stringBuffer1);

        System.out.println(stringBuffer);//Hello 不变
        System.out.println(stringBuffer1);//WorldWorld 变

    }

    private static void change(StringBuffer stringBuffer, StringBuffer stringBuffer1) {
        stringBuffer = stringBuffer1; //直接赋值不变
        stringBuffer.append(stringBuffer1);//调用append方法改变
    }
}
