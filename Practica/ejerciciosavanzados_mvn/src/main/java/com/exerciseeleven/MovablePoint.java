/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseeleven;

public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint[x=" + x + ";y=" + y + ";xSpeed=" + xSpeed + ";ySpeed=" + ySpeed +"]";
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
