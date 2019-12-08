import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static List<Character> func(String str1, String str2){
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            char temp = str1.charAt(i);
            if (!str2.contains(temp+"")){
                ret.add(new Character(temp));
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        System.out.println(func(str1,str2));

    }
}
