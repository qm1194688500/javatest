package com.bit;

 class HasStatic {
     private static int x = 100;

     public static void main(String[] args) {
         HasStatic has1 = new HasStatic();
         has1.x++;
         HasStatic has2 = new HasStatic();
         has2.x++;
         has1 = new HasStatic();
         has1.x++;
         HasStatic.x--;
         System.out.println("x=" + x);
     }
}
