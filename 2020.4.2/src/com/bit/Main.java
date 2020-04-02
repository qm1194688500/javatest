package com.bit;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int num = n*n;
            String str = new String(String.valueOf(num));
            String str2 = str.substring(1,str.length());
            if (str2.equals(String.valueOf(n))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
