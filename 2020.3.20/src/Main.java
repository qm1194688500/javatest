import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int n = sc.nextInt();
            if (n==0){
                return;
            }
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int count = 0;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]==x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
