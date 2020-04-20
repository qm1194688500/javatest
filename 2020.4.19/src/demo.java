import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)!='_'){
                    stringBuilder.append(str.charAt(i));
                }else{
                    stringBuilder.append((str.charAt(i+1)+"").toUpperCase());
                    i++;
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
