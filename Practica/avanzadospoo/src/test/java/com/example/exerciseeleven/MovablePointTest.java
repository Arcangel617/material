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
class MovablePointTest {

  private MovablePoint movablePoint;
  private int x = 99;
  private int y = 99;
  private int xSpeed = 99;
  private int ySpeed = 99;

  @Test
  void shouldBuildAMovablePointObject() {
    String expected =
        "MovablePoint[x=" + x + ";y=" + y + ";xSpeed=" + xSpeed + ";ySpeed=" + ySpeed + "]";
    movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
    assertEquals(expected, movablePoint.toString());
  }

  @Test
  void shouldCallMoveUp() {
    movablePoint = mock(MovablePoint.class);
    doNothing().when(movablePoint).moveUp();
    movablePoint.moveUp();
    verify(movablePoint, times(1)).moveUp();
  }

  @Test
  void shouldCallMoveDown() {
    movablePoint = mock(MovablePoint.class);
    doNothing().when(movablePoint).moveDown();
    movablePoint.moveDown();
    verify(movablePoint, times(1)).moveDown();
  }

  @Test
  void shouldCallMoveRight() {
    movablePoint = mock(MovablePoint.class);
    doNothing().when(movablePoint).moveRight();
    movablePoint.moveRight();
    verify(movablePoint, times(1)).moveRight();
  }

  @Test
  void shouldCallMoveLeft() {
    movablePoint = mock(MovablePoint.class);
    doNothing().when(movablePoint).moveLeft();
    movablePoint.moveLeft();
    verify(movablePoint, times(1)).moveLeft();
  }
}