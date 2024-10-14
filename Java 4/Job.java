import java.util.ArrayList;
import java.util.Optional;

/**
 * Stores a list of all employees
 */
public class Job {
    /**
     * Directory of all employees
     */
    private ArrayList<Employee> allEmployees;

    /**
     * Creates a job object with empty list of employees
     */
    public Job(){
        allEmployees = new ArrayList<>();
    }

    /**
     * List of all employees
     * @return list of all employees
     */
    public ArrayList<Employee> getEmployees(){
        return allEmployees;
    }

    /**
     * The list of all employees that work
     * @param allEmployees new list of employees
     */
    public void setAllEmployees(ArrayList<Employee> allEmployees){
        this.allEmployees = allEmployees;
    }

    /**
     * Adds employee
     * @param employee adds employee to allEmployees
     */
    public void addEmployee(Employee employee){
        allEmployees.add(employee);
    }

    /**
     * Removes employee
     * @param employee employee that will be removed
     */
    public void removeEmployee(Employee employee){
        allEmployees.remove(employee);
    }

    /**
     * Gets the average salary of all employees
     * @return optional that has the average salary or nothing if there are no employees
     */
    public Optional<Double> computeAverageSalary(){
        if(allEmployees.isEmpty()){
            return Optional.empty();
        }
        double total = 0;
        for(Employee employee : allEmployees){
            total += employee.getSalary();
        }
        double avg = total / allEmployees.size();
        return Optional.of(avg);
    }

    /**
     * Returns employee that makes the most money
     * @return an optional that has the most paid employee, or it is empty
     */
    public Optional<Employee> highestPaid(){
        if(allEmployees.isEmpty())
            return Optional.empty();

        Employee highestPaid = allEmployees.get(0);
        for(Employee employee : allEmployees){
            if(employee.getSalary() > highestPaid.getSalary());
            highestPaid = employee;
        }
        return Optional.of(highestPaid);
    }

    /**
     * Returns string of list of employees
     * @return list of employees
     */
    @Override
    public String toString(){
        return allEmployees.toString();
    }
}
