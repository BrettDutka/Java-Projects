import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void constructor() {
        Employee employee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        assertEquals("McDonR75", employee.getID());
        assertEquals("Ronald", employee.getFirstName());
        assertEquals("McDonald", employee.getLastName());
        assertEquals(1975, employee.getBirthYear());
        assertEquals(75000.0, employee.getSalary());

    }

    @Test
    void setSalary() {
        Employee employee = new Employee("Bobby", "Jones", 1930, 50000.0);
        employee.setSalary(57500.0);
        assertEquals(57500, employee.getSalary(), 0.001);
    }

    @Test
    void bonus() {
        Employee employee = new Employee("Walter", "Hagan", 1925, 35000.0);
        employee.bonus();
        assertEquals(38500.0, employee.getSalary(), 0.001);
    }

    @Test
    void testEquals() {
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);
        Employee thirdEmployee = new Employee("Walter", "Hagan", 1925, 38500.0);
        assertTrue(firstEmployee.equals(firstEmployee));
        assertFalse(firstEmployee.equals(secondEmployee));
        assertFalse(firstEmployee.equals(thirdEmployee));

    }

    @Test
    void testToString() {
        Employee employee = new Employee("Bobby", "Jones", 1930, 50000.0);
        String ans = "Bobby, Jones, 1930, 50000.0, JonesB30";
        assertEquals(ans, employee.toString());
    }
}