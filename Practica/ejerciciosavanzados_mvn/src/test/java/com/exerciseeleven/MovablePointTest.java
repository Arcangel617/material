/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exerciseeleven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MovablePointTest {

    private MovablePoint movablePoint;
    private int x = 99;
    private int y = 99;
    private int xSpeed = 99;
    private int ySpeed = 99;

    @Test
    public void shouldBuildAMovablePointObject() {
        String expected = "MovablePoint[x=" + x + ";y=" + y + ";xSpeed=" + xSpeed + ";ySpeed=" + ySpeed + "]";
        movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
        assertEquals(expected,movablePoint.toString());
    }

    @Test
    public void shouldCallMoveUp() {
        movablePoint = mock(MovablePoint.class);
        doNothing().when(movablePoint).moveUp();
        movablePoint.moveUp();
        verify(movablePoint, times(1)).moveUp();
    }

    @Test
    public void shouldCallMoveDown() {
        movablePoint = mock(MovablePoint.class);
        doNothing().when(movablePoint).moveDown();
        movablePoint.moveDown();
        verify(movablePoint, times(1)).moveDown();
    }

    @Test
    public void shouldCallMoveRight() {
        movablePoint = mock(MovablePoint.class);
        doNothing().when(movablePoint).moveRight();
        movablePoint.moveRight();
        verify(movablePoint, times(1)).moveRight();
    }

    @Test
    public void shouldCallMoveLeft() {
        movablePoint = mock(MovablePoint.class);
        doNothing().when(movablePoint).moveLeft();
        movablePoint.moveLeft();
        verify(movablePoint, times(1)).moveLeft();
    }
}