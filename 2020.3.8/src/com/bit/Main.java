package com.bit;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(method(x,y));
    }
    public static int method(int x, int y){

        int n=0;
        if(x%4==0||y%4==0){
            n=x*y/2;
        }//如果能整除4 那么蛋糕个数为网格个数的一半
        else{
            n=x*y/2+1;
        }//不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
        return n;
    }
}
