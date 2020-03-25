import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int num =  gifts[n/2];
        int sum = 0;
        for (int i = 0; i <gifts.length ; i++) {
            if (gifts[i]==num){
                sum++;
            }
        }
        return sum<=n/2?0:num;
    }
}
