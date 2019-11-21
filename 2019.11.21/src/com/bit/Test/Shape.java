package com.bit.Test;

public class Shape {
    public void draw(){}
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
