package com;

import java.util.*;
class peopele{
    String name;

    public peopele(String name) {
        this.name = name;
    }
    public void method(){
        System.out.println("haha");
    }
}
public class Main {
    public static void main(String[] args) {
        peopele peopele = null;
        peopele.method();
        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        String ret = "";
        for (int i = array.length-1; i >=0; i--) {
            ret = ret + array[i];
        }
        System.out.println(ret);*/
    }
}
