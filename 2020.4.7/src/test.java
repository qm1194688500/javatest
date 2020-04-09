import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str1 = sc.nextLine().toUpperCase();
            String str2 = sc.nextLine().toUpperCase();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i <str1.length() ; i++) {
                if (!str2.contains(str1.charAt(i)+"")){
                    set.add(str1.charAt(i));
                }
            }
            for (Character str:set
                 ) {
                System.out.print(str);
            }
        }
    }
}
