import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            String[] arr = str.split(",");
            int[] prices = new int[arr.length];
            for (int i = 0; i <arr.length ; i++) {
                prices[i] = Integer.valueOf(arr[i]);
            }
            System.out.println(calculateMax(prices));
        }
    }
    public static int calculateMax(int[] prices) {
        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE,secondSell = 0;
        for (int curPrice: prices
                ) {
            firstBuy = Math.max(firstBuy,-curPrice);
            firstSell = Math.max(firstSell,firstBuy+curPrice);
            secondBuy = Math.max(secondBuy,firstSell-curPrice);
            secondSell = Math.max(secondSell,secondBuy+curPrice);
        }
        return secondSell;
    }
}