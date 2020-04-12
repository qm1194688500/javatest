import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine().substring(2);
            System.out.println(Integer.parseInt(str,16));
        }
    }
}
