package com.example.exercisetwelve;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println();

        ResizableCircle resizableCircle = new ResizableCircle(6);
        System.out.println(resizableCircle);
        resizableCircle.resize(5);
    }
}
