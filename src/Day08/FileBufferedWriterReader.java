package Day08;

import java.io.*;

public class FileBufferedWriterReader {
    public static void main(String[] args) throws IOException {
        bufferedWriter();
        System.out.println("*********************");
        bufferedWriterNewLine();
        System.out.println("*********************");
        buffereReader();
        System.out.println("*********************");
        bufferedReaderReadLine();

    }

    static void bufferedWriter() throws IOException {
        /*
        BufferedWriter 和 FileWriter差不多
        区别与BufferedWriter每次写数据的时候没有写满，就不会写入硬盘当中 8192个字符
        已经满了，就会一次性写入硬盘当中
        如果最终关闭流的时候，如果仍然没有满，那么也会将剩余有效部分写入到硬盘当中

        1,创建一个普通fileWriter
        2,使用构造方法将普通的fileWriter对象包装成为BufferedWriter
         */
        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day08/file0.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("BufferedWriterTest\n");

        bufferedWriter.close();//不需要关闭fileWriter
    }

    static void bufferedWriterNewLine() throws IOException {
        /*
        BufferedWriter额外提供了一个换行的方法
        public void newLine（）将对根据 操作系统 不同，选择写\r\n,\n,\r
         */
        FileWriter fileWriter = new FileWriter("/Users/rileylee/Desktop/Java/src/Day08/file1.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.newLine();
        bufferedWriter.write("BufferedNewLine");

        bufferedWriter.close();
    }

    static void buffereReader() throws IOException {
        /*
        8192个字符被写满的时候才写入硬盘
         */
        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day08/file2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        int i;
//        while ((i = bufferedReader.read()) != -1) {
//            System.out.println((char)i);
//        }
        char[] buf = new char[2];
        int len;

        while ((len = fileReader.read(buf)) != -1) {
            String string = new String(buf, 0, len);
            System.out.println(string);
        }

        bufferedReader.close();
    }

    static void bufferedReaderReadLine() throws IOException {
        /*
        BufferedReader提供一个方法，可以读取一整行字符串
        public String readLine();
        返回值为一行的String
        如果没有下一行 返回值为null
         */
        FileReader fileReader = new FileReader("/Users/rileylee/Desktop/Java/src/Day08/file4.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

//        line = bufferedReader.readLine();
//        System.out.println(line);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
