/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisetwelve;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        setRadius(radius*percent);
    }

    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }
}
