import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            ArrayList<Character> A = new ArrayList<>();
            ArrayList<Character> B = new ArrayList<>();
            for (int i = 0; i <str1.length() ; i++) {
                A.add(str1.charAt(i));
            }
            for (int i = 0; i <str2.length() ; i++) {
                B.add(str2.charAt(i));
            }
            for (int i = 0; i <B.size() ; i++) {
                if (A.contains(B.get(i))){
                    A.remove(A.indexOf(B.get(i)));
                    B.remove(i);
                    i--;
                }
            }
            if (B.size()!=0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
