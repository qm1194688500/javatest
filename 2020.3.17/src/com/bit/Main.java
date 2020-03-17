package com.bit;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int i = 0;
        while (i<10){
            num[i] = sc.nextInt();
            i++;
        }
        StringBuilder string = new StringBuilder();
        for (int j = 1; j <num.length; j++) {
            if (num[j]>0){
                for (int k = 0; k <num[j] ; k++) {
                    string.append(j);
                }
            }
        }
        if (num[0]>0){
            for (int j = 0; j <num[0] ; j++) {
                string.insert(1,0);
            }
        }
        System.out.println(string.toString());
    }

}
