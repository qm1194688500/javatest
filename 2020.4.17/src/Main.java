import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            int retMax = 0;
            int ret = 0;
            for (int i = 0; i <n ; i++) {
                if (arr[i]>=0){
                    ret+=arr[i];
                }else{
                    if (ret>retMax){
                        retMax = ret;
                        ret=0;
                    }
                }
            }
            if (ret>retMax){
                retMax=ret;
            }
            System.out.println(retMax);
        }
    }
}
