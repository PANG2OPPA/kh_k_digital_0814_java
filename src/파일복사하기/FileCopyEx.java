package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/팡이.jpg";
        String targetFileName = "d:/tmp/dog.jpg";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readBytesNo;
        byte[] readBytes = new byte[100];
        while ((readBytesNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes, 0, readBytesNo);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
