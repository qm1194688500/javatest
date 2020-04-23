import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = array.length;
        if (n==0){
            return 0;
        }
       Arrays.sort(array);
        int ret = array[n/2];
        int num = 0;
        for (int i = 0; i <n ; i++) {
            if (array[i]==ret){
                num++;
            }
        }
        if (num>n/2){
            return ret;
        }else{
            return 0;
        }
    }
}
