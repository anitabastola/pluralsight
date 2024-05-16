package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_StartTimeNotSet_StartTimeSetToGivenTime() {

        Employee employee = new Employee(1, "John Doe", "IT", 20.0);
        employee.punchIn(9.0);
        assertEquals(9.0, employee.getStartTime());
    }

    @Test
    public void punchOut_HoursNotSet_HoursWorkedSetCorrectly() {
        Employee employee = new Employee(1, "John Doe", "IT", 20.0);
        employee.punchIn(9.0);
        employee.punchOut(17.5);
        assertEquals(8.5, employee.getHoursWorked());

    }

}