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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MovableCircleTest {

    private MovableCircle movableCircle;
    private int x = 99;
    private int y = 99;
    private int xSpeed = 99;
    private int ySpeed = 99;
    private int radius = 1;

    @Test
    public void shouldBuildAMovableCircleObject() {
        String expected = "MovableCircle[center={MovablePoint[x=" + x + ";y=" + y + ";xSpeed=" + xSpeed +
                ";ySpeed=" + ySpeed + "]};radius=" + radius + "]";
        movableCircle = new MovableCircle(x,y,xSpeed,ySpeed,radius);
        assertEquals(expected,movableCircle.toString());
    }

    @Test
    public void shouldCallMoveUp() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveUp();
        movableCircle.moveUp();
        verify(movableCircle, times(1)).moveUp();
    }

    @Test
    public void shouldCallMoveDown() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveDown();
        movableCircle.moveDown();
        verify(movableCircle, times(1)).moveDown();
    }

    @Test
    public void shouldCallMoveRight() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveRight();
        movableCircle.moveRight();
        verify(movableCircle, times(1)).moveRight();
    }

    @Test
    public void shouldCallMoveLeft() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveLeft();
        movableCircle.moveLeft();
        verify(movableCircle, times(1)).moveLeft();
    }
}