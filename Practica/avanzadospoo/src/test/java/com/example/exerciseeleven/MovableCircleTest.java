package com.example.exerciseeleven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MovableCircleTest {

    private MovableCircle movableCircle;
    private int x = 99;
    private int y = 99;
    private int xSpeed = 99;
    private int ySpeed = 99;
    private int radius = 1;

    @Test
    void shouldBuildAMovableCircleObject() {
        String expected = "MovableCircle[center={MovablePoint[x=" + x + ";y=" + y + ";xSpeed=" + xSpeed +
                ";ySpeed=" + ySpeed + "]};radius=" + radius + "]";
        movableCircle = new MovableCircle(x,y,xSpeed,ySpeed,radius);
        assertEquals(expected,movableCircle.toString());
    }

    @Test
    void shouldCallMoveUp() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveUp();
        movableCircle.moveUp();
        verify(movableCircle, times(1)).moveUp();
    }

    @Test
    void shouldCallMoveDown() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveDown();
        movableCircle.moveDown();
        verify(movableCircle, times(1)).moveDown();
    }

    @Test
    void shouldCallMoveRight() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveRight();
        movableCircle.moveRight();
        verify(movableCircle, times(1)).moveRight();
    }

    @Test
    void shouldCallMoveLeft() {
        movableCircle = mock(MovableCircle.class);
        doNothing().when(movableCircle).moveLeft();
        movableCircle.moveLeft();
        verify(movableCircle, times(1)).moveLeft();
    }
}