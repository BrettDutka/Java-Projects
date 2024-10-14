import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void constructor() {
        Job job = new Job();
        assertNotNull(job.getEmployees());
        assertTrue(job.getEmployees().isEmpty());
    }

    @Test
    void addEmployee() {
        Job job = new Job();
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);
        job.addEmployee(firstEmployee);
        job.addEmployee(secondEmployee);

        ArrayList<Employee> allEmployees = job.getEmployees();
        assertEquals(2, allEmployees.size());
        assertTrue(allEmployees.contains(firstEmployee));
        assertTrue(allEmployees.contains(secondEmployee));
    }

    @Test
    void removeEmployee() {
        Job job = new Job();
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);

        job.addEmployee(firstEmployee);
        job.addEmployee(secondEmployee);
        job.removeEmployee(firstEmployee);

        ArrayList<Employee> allEmployees = job.getEmployees();
        assertEquals(1, allEmployees.size());
        assertFalse(allEmployees.contains(firstEmployee));
        assertTrue(allEmployees.contains(secondEmployee));
    }

    @Test
    void computeAverageSalary() {
        Job job = new Job();
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);
        Employee thirdEmployee = new Employee("Walter", "Hagan", 1925, 38500.0);

        job.addEmployee(firstEmployee);
        job.addEmployee(secondEmployee);
        job.addEmployee(thirdEmployee);

        Optional<Double> avg = job.computeAverageSalary();
        assertTrue(avg.isPresent());
        assertEquals(54500.0, avg.get(), 0.01);

        Job noJob = new Job();
        Optional<Double> empty = noJob.computeAverageSalary();
        assertFalse(empty.isPresent());
    }

    @Test
    void mostPaid() {
        Job job = new Job();
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);
        Employee thirdEmployee = new Employee("Walter", "Hagan", 1925, 38500.0);

        job.addEmployee(firstEmployee);
        job.addEmployee(secondEmployee);
        job.addEmployee(thirdEmployee);

        Optional<Employee> mostPaidEmployee = job.highestPaid();
        assertTrue(mostPaidEmployee.isPresent());
        assertEquals(thirdEmployee, mostPaidEmployee.get());

        Job empty = new Job();
        Optional<Employee> none = empty.highestPaid();
        assertFalse(none.isPresent());
    }

    @Test
    void testToString() {
        Job job = new Job();
        Employee firstEmployee = new Employee("Ronald", "McDonald", 1975, 75000.0);
        Employee secondEmployee = new Employee("Bobby", "Jones", 1930, 50000.0);
        Employee thirdEmployee = new Employee("Walter", "Hagan", 1925, 38500.0);

        job.addEmployee(firstEmployee);
        job.addEmployee(secondEmployee);
        job.addEmployee(thirdEmployee);

        String ans = "[Ronald McDonald,1975,75000.0,McDonR75, Bobby Jones,1930,50000.0,JonesB30, Walter Hagan,1925,38500.0,HaganW25]";
        assertEquals(ans, job.toString());
    }
}