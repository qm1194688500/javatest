import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String Judge = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <str.length() ; i++) {
                if (!Judge.contains(str.charAt(i)+"")){
                    stringBuilder.append(str.charAt(i)+"");
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
