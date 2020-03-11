package com.bit;

import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        while (n!=0){
            sum*=n;
            n--;
        }
        int count = 0;
        while (sum%10==0){
            sum/=10;
            count++;
        }
        System.out.println(count);*/

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int result = 0;
            while (n != 0) {
                result += n / 5;
                n /= 5;
            }
            System.out.println(result);
        }
    }
}
