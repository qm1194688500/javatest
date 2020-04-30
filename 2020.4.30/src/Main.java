import java.util.*;
public class Main {
    public static void main(String[] args) {

    }
    public int findMaxGap(int[] A, int n) {
        int max = 0;
        for (int i = 0; i <A.length ; i++) {
            if (A[i]>max){
                max = A[i];
            }
        }
        int left = A[0];
        int right = A[n-1];
        if (left<right){
            return max-left;
        }else{
            return max-right;
        }
    }
}
