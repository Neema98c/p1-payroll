/* **********************
 * CSC-20004 2023/24     
 * Working with legacy code
 * 
 * Note that this code relies on the library provided by the repo:
 * https://github.com/csc20004-2024/p1-legacypayroll.git
 * **********************/
package uk.ac.keele.csc20004;

import java.util.ArrayList;

import uk.ac.keele.csc20004.legacy.CommissionEmployee;
import uk.ac.keele.csc20004.legacy.Employee;
import uk.ac.keele.csc20004.legacy.HourlyEmployee;
import uk.ac.keele.csc20004.legacy.SalariedEmployee;

/**
 * Main class for the legacy code.
 */
public class Main {
    public static void main(String[] args) {
        // Creating data structure to hold employees
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Adding a couple of employess, with different types of contracts
        Employee e1 = 
        new CommissionEmployee("Marco", 
            "Ortolani", 
            "123-456-999", 
            1000, 0.7);
        employees.add(e1);

        Employee e2 = 
        new HourlyEmployee("Jane", 
            "Doe", 
            "111-222-333", 
            800, 18);
        employees.add(e2);

        Employee e3 = 
        new SalariedEmployee("Xie", 
            "He", 
            "999-888-777", 
            1200.00);
        employees.add(e3);

        for (Employee employee : employees) {
            System.err.println(employee);            
        }

        // Now try to add a new employee, using the new class you created
        // Also, try to use a different data structure to hold the employees
    }
}
