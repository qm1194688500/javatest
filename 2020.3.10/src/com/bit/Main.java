package com.bit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] array = new int[str1.length-1];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.valueOf(str1[i]);
        }
        int k = Integer.valueOf(str1[str1.length-1]);
        Arrays.sort(array);
        for (int i = 0; i <k; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
