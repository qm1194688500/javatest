import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        /*{
            String path = "E:\\书籍\\编程之美.pdf";
            File file = new File(path);
            System.out.println(file);
            System.out.println(file.exists());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.getParent());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
        }*/
        /*{
            String path = "E:\\书籍";
            String filename = "hahaha.txt";
            File file = new File(path,filename);
            System.out.println(file.exists());
            boolean success = file.createNewFile();
            System.out.println(success);
        }*/
        /*{
            String parent = "E:\\书籍";
            String filename = "文件夹";
            File file = new File(parent,filename);
            System.out.println(file.exists());
            boolean success = file.mkdir();
            System.out.println(success);
        }*/
        {
            String parent = "E:\\书籍";
            String filename = "一个文件.txt";
            File file = new File(parent,filename);
            file.createNewFile();
            System.out.println(file.exists());
            file.deleteOnExit();
           // file.deleteOnExit();

        }
    }
}
