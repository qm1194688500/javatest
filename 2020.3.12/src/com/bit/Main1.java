package com.bit;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(method(x,y));
    }
    public static int method(int x , int y){
        if (x==1||y==1){
            return 1;
        }
        return method(x-1,y)+ method(x,y-1);
    }
}
