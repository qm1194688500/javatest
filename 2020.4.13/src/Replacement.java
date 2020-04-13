import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        char[] arr = iniString.toCharArray();
        String str = "";
        for (int i = 0; i < length; i++) {
            if (arr[i]==' '){
                str+="%20";
            }else{
                str+=arr[i];
            }
        }
        return str;
    }
}