/**
 * Creates an employee ID from the employee object
 */
public class Employee {
    private final String id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private double salary;

    /**
     * Creates the employee object with the given first name, last name, birth year, and salary.
     * @param firstName first name of employee
     * @param lastName last name of employee
     * @param birthYear birth year of employee
     * @param salary salary of employee
     */
    public Employee(String firstName, String lastName, int birthYear, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.id = employeesID(lastName, firstName, birthYear);
    }

    /**
     * Creates the employee ID using their last name, first initial, and the last two numbers of their birth year
     * @param lastName last name of the employee
     * @param firstName first name of the employee
     * @param birthYear birth year of the employee
     * @return the employee ID
     */
    private static String employeesID(String lastName, String firstName, int birthYear){
        String prefixLast = lastName.substring(0, Math.min(lastName.length(), 5));
        String firstNameInitial = firstName.substring(0, 1);
        String suffixBY = String.format("%02d", birthYear % 100);
        return prefixLast + firstNameInitial + suffixBY;
    }

    /**
     * Returns employee ID
     * @return employee ID
     */
    public String getID(){
        return id;
    }

    /**
     * Returns the first name of the employee
     * @return first name of employee
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Returns last name of employee
     * @return last name of employee
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Returns the birth year of employee
     * @return the birth year of the employee
     */
    public int getBirthYear(){
        return birthYear;
    }

    /**
     * The yearly salary of the employee
     * @return the yearly salary of employee
     */
    public double getSalary(){
        return salary;
    }

    /**
     * Sets the salary for employee
     * @param salary the salary of the employee
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * Bonus increases their salary by 10%
     */
    public void bonus(){
        salary *= 1.1;
    }

    /**
     * Compares the employee's object with other objects and checks if their equal based on the IDs
     * @param compare is compared against other objects
     * @return true if they are equal and false if they are not
     */
    @Override
    public boolean equals(Object compare){
        if(this == compare)
            return true;

        if(compare == null || getClass() != compare.getClass())
            return false;

        Employee other = (Employee) compare;
        return id.equals(other.id);
    }

    /**
     * Returns a string of the employee's object (their name, birth year, salary, employee id)
     * @return a string of the employee's object
     */
    @Override
    public String toString(){
        return firstName + ", " + lastName + ", " + birthYear +", " + salary + ", " + id;
    }
}


