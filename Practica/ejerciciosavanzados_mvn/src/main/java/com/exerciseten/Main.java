/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseten;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle());
        shapes.add(new Circle(5));
        shapes.add(new Circle(5, "Red", true));
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(3,4));
        shapes.add(new Rectangle(3,4, "Blue", false));
        shapes.add(new Square());
        shapes.add(new Square(5));
        shapes.add(new Square(6, "Green", true));

        for (Shape shape: shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}