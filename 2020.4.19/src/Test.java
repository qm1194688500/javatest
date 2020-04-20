import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split("[^a-zA-Z]+");
            String ret = "";
            for (int i = arr.length-1; i >=0 ; i--) {
                ret+=arr[i]+" ";
            }
            ret = ret.trim();
            System.out.println(ret);
        }
    }
}
