/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseeleven;

public class MovableCircle implements  Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableCircle[center={" + center.toString() + "};radius=" + radius + "]";
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRight() {

    }

    public void moveLeft() {

    }
}
