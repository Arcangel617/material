/*
 * Author: Arcangel Andres Artigue
 * Email: artigue_arcangel@hotmail.com
 *
 * Copyright (c) 2018.
 */

package com.exercisenine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    private Staff staff;
    private String staffSchool = "staffSchool";
    private double staffPay = 9999;
    private String staffName = "staffName";
    private String staffAddress = "staffAddress";


    @Before
    public void setup() {
        staff = new Staff(staffSchool, staffPay, staffName, staffAddress);
    }

    @Test
    public void shouldBuildaStaffObject() {
        String expected = "Staff[Person[name=" + staffName + ",address=" + staffAddress + "],school=" +
                staffSchool + ",pay=" + staffPay + "]";
        assertEquals(expected, staff.toString());
    }

    @Test
    public void shouldReturnStaffSchool() {
        assertEquals(staffSchool, staff.getSchool());
    }

    @Test
    public void shouldReturnStaffPay() {
        assertEquals(staffPay, staff.getPay(), 0);
    }

    @Test
    public void shouldUpdateStaffSchool() {
        String newStaffSchool = "newStaffSchool";
        staff.setSchool(newStaffSchool);
        assertEquals(newStaffSchool, staff.getSchool());
    }

    @Test
    public void shouldUpdateStaffPay() {
        double newStaffPay = 1111;
        staff.setPay(newStaffPay);
        assertEquals(newStaffPay, staff.getPay(), 0);
    }

}