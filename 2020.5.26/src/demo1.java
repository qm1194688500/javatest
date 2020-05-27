import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class demo1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String text = br.readLine();
        String text1 = br.readLine();
        String text2 = br.readLine();
        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
    }
}
