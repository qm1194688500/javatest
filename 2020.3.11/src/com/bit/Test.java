package com.bit;

class People{
    String name = "NOMAME";

    public People(String name) {
        this.name = name;
    }
}

public class Test {
    private static void method(){
        System.out.println("method");
    }
    public static void main(String[] args) {
        ((Test) null).method();
        /*int i = 0;
        Integer i1 = new Integer(0);
        System.out.println(i1==i);
        System.out.println(i1.equals(i));*/
    }
}
