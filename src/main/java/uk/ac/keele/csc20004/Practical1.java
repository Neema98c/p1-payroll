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
 * Sample class with a main method to show use of the legacy code
 * for practical 1.
 */
public class Practical1 {
    public static void main(String[] args) {
        // A data structure to hold employees
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Adding a couple of employes, with different types of contracts

        // A commission employee
        Employee e1 = 
        new CommissionEmployee("Marco", 
            "Ortolani", 
            "123-4567-999", 
            1000, 0.7);
        employees.add(e1);

        // An hourly employee
        Employee e2 = 
        new HourlyEmployee("Jane", 
            "Doe", 
            "111-2222-333", 
            800, 18);
        employees.add(e2);

        // A salaried employee
        Employee e3 = 
        new SalariedEmployee("Xie", 
            "He", 
            "999-8888-777", 
            1200.00);
        employees.add(e3);

        // A salaried employee
        Employee e4 = 
        new MinimumWageEmployee("Fatima", 
            "Al-Mansoori", 
            "ABC-DEFG-HIJ", 
            22, 40);
        employees.add(e4);

        // Now try to add a new employee, using the new class you created

        Employee e5 = 
        new MinimumWageEmployee("BOB", 
        "bobbington", 
        "abc-dede-beb",
        21, 30);
        employees.add(e5);

        // print all employees
        // this will use the toString() method of the Employee class (or its subclasses)
        
        //for (Employee employee : employees) {
        //  System.out.println(employee);            
        //}

        // Now, try to use a different data structure to hold the employees
        // Add all previous objects to the new data structure and print them

        

        // TO DO: add your code here
        for (Employee employee : employees) {
            System.out.println(employee);            
        }
    }
}
