package com.example.exercisenine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTest {

    private Staff staff;
    private String staffSchool = "staffSchool";
    private double staffPay = 9999;
    private String staffName = "staffName";
    private String staffAddress = "staffAddress";


    @BeforeEach
    void setup() {
        staff = new Staff(staffSchool, staffPay, staffName, staffAddress);
    }

    @Test
    void shouldBuildaStaffObject() {
        String expected = "Staff[Person[name=" + staffName + ",address=" + staffAddress + "],school=" +
                staffSchool + ",pay=" + staffPay + "]";
        assertEquals(expected, staff.toString());
    }

    @Test
    void shouldReturnStaffSchool() {
        assertEquals(staffSchool, staff.getSchool());
    }

    @Test
    void shouldReturnStaffPay() {
        assertEquals(staffPay, staff.getPay(), 0);
    }

    @Test
    void shouldUpdateStaffSchool() {
        String newStaffSchool = "newStaffSchool";
        staff.setSchool(newStaffSchool);
        assertEquals(newStaffSchool, staff.getSchool());
    }

    @Test
    void shouldUpdateStaffPay() {
        double newStaffPay = 1111;
        staff.setPay(newStaffPay);
        assertEquals(newStaffPay, staff.getPay(), 0);
    }

}