import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("新建文本文档.txt");

        //is.read(); // 一次只读一个字节
        // 什么时候就知道把所有的内容都读完了呢？
        // End Of Stream: EOS

        /*
        int b;
        while ((b = is.read()) != -1) {
            System.out.println(b);
        }
        */

        byte[] buf = new byte[2];
        int len;
        while ((len = is.read(buf)) != -1) {
            System.out.println("读一次");
            for (int i = 0; i < len; i++) {
                System.out.println(buf[i]);
            }
        }

        is.close();
    }
}
