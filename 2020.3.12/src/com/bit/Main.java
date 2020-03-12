package com.bit;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int fib = 0;
        while (fib<n){
            fib = x + y;
            x=y;
            y=fib;
        }
        System.out.println((fib-n)<(n-x)?(fib-n):(n-x));
    }
}
