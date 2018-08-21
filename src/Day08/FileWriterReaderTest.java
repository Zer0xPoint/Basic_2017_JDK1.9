package Day08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    /*
    字节流 可以处理任何一种文件的数据
    字符流 只能处理纯文本文件（只有字的文件）
    输入输出字符 读写纯文本文件
    */

    public static void main(String[] args) {
        try {
            fileWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("********************");
        try {
            fileWriterOverload();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("********************");
        try {
            fileReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("********************");
        try {
            fileReaderArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void fileWriter() throws IOException {
        /*
        1,导包
        import java.io.FileWriter;

        2,创建构造方法
        public FileWriter(String fileName)
        FileWriter fw = new FilerWriter(String fileName)

        3,使用方法
        写 public void write(String str)
        关闭 public void close() 释放资源
        */
        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day08/file0.txt");//("file0.txt, true") true代表append=true

        fileWriter.write("Hello World");
        fileWriter.append("!");
        fileWriter.append("\n");//linux中的换行符是 \n
        fileWriter.append("Java");

        fileWriter.close();
    }

    static void fileWriterOverload() throws IOException {
        /*
        write方法有 5中重载形式
        1，write（int）单个文字对应的数字
        2，write（str）完整字符串
        3，write（str，offset，count）字符串的一部分
        4，write（char[] array）完整字符数组
        5，write（char[] array，offset，count）字符数组的一部分
         */
        char[] chars = {'a', 'b', 'c'};

        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day08/file1.txt");

        fileWriter.write(65);//1
        fileWriter.write("Lee");//2
        fileWriter.write("Hello World", 5, 5);//3
        fileWriter.write(chars);//4
        fileWriter.write(chars, 0, 1);//5

        fileWriter.close();
    }

    static void fileReader() throws IOException {
        /*
        使用方法
        public int read() 读取下一个字符，得到对应的ASCII或Unicode码
        public void close()
         */
        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day08/file2.txt");//读取 时指定文件名必须存在 否则报错FileNotFoundException

        int i;
        while ((i = fileReader.read()) != -1) {//注意 while循环条件内read第一次就运行了
            System.out.println((char) i);
        }

        fileReader.close();
    }

    static void fileReaderArray() throws IOException {
        /*
        单个读取字符效率很低，因此FileReader提供了另外一种重载形式的read方法

        public int read（char[] buf）一次读取一个字符数组的数据
        参数是一个字符数组
        返回值为有效数组
         */
        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day08/file3.txt");

//        char[] buf = new char[2];
//        int len = fileReader.read(buf);
//        String string = new String(buf,0,len);//只用字符串中的有效部分来创建字符串
//
//        fileReader.close();
//
//        System.out.println(string);
//        System.out.println(len);
        char[] buf = new char[4];
        int len;

        while ((len = fileReader.read(buf)) != -1) {
            String string = new String(buf, 0, len);
            System.out.println(string);
        }
        fileReader.close();

    }

}
