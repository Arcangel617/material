package com.example.exercisenine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {

  private Student student;
  private String studentName = "studentName";
  private String studentAddress = "studentAddress";
  private String studentProgram = "studentProgram";
  private int studentYear = 9999;
  private double studentFee = 1000;

  @BeforeEach
  public void setup() {
    student = new Student(studentName, studentAddress, studentProgram, studentYear, studentFee);
  }

  @Test
  public void shouldBuildAStudentObject() {
    String expected =
        "Student[Person[name=" + studentName + ",address=" + studentAddress + "],program=" +
            studentProgram + ",year=" + studentYear + ",fee=" + studentFee + "]";
    assertEquals(expected, student.toString());
  }

  @Test
  public void shouldReturnStudentProgram() {
    assertEquals(studentProgram, student.getProgram());
  }

}