package com.bit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = method1(str1,str2);
        System.out.println(str3);
    }
    public static String method1(String str1,String str2){
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i <str1.length() ; i++) {
            if (!str2.contains(str1.charAt(i)+"")){
                stringBuilder1.append(str1.charAt(i));
            }
        }
        return stringBuilder1.toString();
    }
}
