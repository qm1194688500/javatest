import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr =  new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                int lift = -1;
                int right = -1;
                for (int j = i; j>=0  ; j--) {
                    if (arr[j]<arr[i]){
                        lift = j;
                        break;
                    }
                }
                for (int o = i; o<n  ; o++) {
                    if (arr[o]<arr[i]){
                        right = o;
                        break;
                    }
                }
                System.out.println(lift+" "+right);
            }

        }
    }
}
