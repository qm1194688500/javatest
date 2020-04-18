import java.util.*;
public class Demo {
    //1、对输入的字符串进行加解密，并输出。
    //2加密方法为：
    //当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
    //当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
    //其他字符不做变化。
    //3、解密方法为加密的逆过程。
    //接口描述：
    //    实现接口，每个接口实现1个基本操作：
    //void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
    //说明：
    //1、字符串以\0结尾。
    //2、字符串最长100个字符。
    //int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
    //说明：
    //1、字符串以\0结尾。
    //    2、字符串最长100个字符。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String encrypt = sc.nextLine();
            String unencrypt = sc.nextLine();
            Encrypt(encrypt);
            unEncrypt(unencrypt);
        }
    }
    public static void Encrypt (String encrypt){
        char[] ch1 = encrypt.toCharArray();
        for (int i = 0; i <ch1.length ; i++) {
            if(ch1[i]>='A' && ch1[i]<'Z') {
                ch1[i] = (char)(ch1[i]+33);
            }else if(ch1[i] == 'Z') {
                ch1[i] = 'a';
            }else if(ch1[i]>='a' && ch1[i]<'z') {
                ch1[i] = (char)(ch1[i]-31);
            }else if(ch1[i] == 'z') {
                ch1[i] = 'A';
            }else if(ch1[i]>='0' && ch1[i]<'9') {
                ch1[i] = (char)(ch1[i]+1);
            }else if(ch1[i] == '9') {
                ch1[i] = '0';
            }
        }
        String str = new String(ch1);
        System.out.println(str);
    }
    public static void unEncrypt (String unEncrypt){
        char[] ch2 = unEncrypt.toCharArray();
        for (int i = 0; i <ch2.length ; i++) {
            if(ch2[i]>'A' && ch2[i]<='Z') {
                ch2[i] = (char)(ch2[i]+31);
            }else if(ch2[i] == 'A') {
                ch2[i] = 'z';
            }else if(ch2[i]>'a' && ch2[i]<='z') {
                ch2[i] = (char)(ch2[i]-33);
            }else if(ch2[i] == 'a') {
                ch2[i] = 'Z';
            }else if(ch2[i]>'0' && ch2[i]<='9') {
                ch2[i] = (char)(ch2[i]-1);
            }else if(ch2[i] == '0') {
                ch2[i] = '9';
            }
        }
        String str = new String(ch2);
        System.out.println(str);
    }
}
