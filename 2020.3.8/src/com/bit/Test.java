package com.bit;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ags = str.split(" ");
        int[] tmp = new int[ags.length];
        for (int i = 0; i <ags.length ; i++) {
            tmp[i] = Integer.valueOf(ags[i]);
        }
        int count = 0;
        int sum = tmp[0];
        for (int j = 1; j <tmp.length; j++) {
            if (tmp[j]==sum){
                count++;
            }else if (count>0){
                count--;
            }else{
                sum = tmp[j];
            }
        }
        System.out.println(sum);
    }
}
