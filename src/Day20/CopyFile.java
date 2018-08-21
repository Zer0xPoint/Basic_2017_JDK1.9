package Day20;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String inputDic = "src/Day20/input/testFile.txt";
        String outputDic = "src/Day20/output/testFile.txt";

        String mp3InputDic = "src/Day20/input/nyan_music.mp3";
        String mp3OutDic = "src/Day20/output/nyan_music.mp3";

        copyFileToDic(inputDic,outputDic);
        copyFileToDic(mp3InputDic,mp3OutDic);
    }

    private static void copyFileToDic(String inputDic, String outputDic) throws IOException {
        InputStream inputStream = new FileInputStream(inputDic);
        OutputStream outputStream = new FileOutputStream(outputDic);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer,0,length);
        }
        inputStream.close();
        outputStream.close();
    }

}
