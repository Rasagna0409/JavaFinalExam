/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S542264
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for Question12");
        System.out.println("Rasagna Reddy Banda");
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(50, "Rachel", 67888.8);
        Employee e2 = new Employee(19, "Ross", 1300.68);
        Employee e3 = new Employee(57, "Monica", 4800.57);
        Employee e4 = new Employee(2, "Phoebe", 38888.90);
        Employee e5 = new Employee(20, "Joey", 8777.67);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        System.out.println("--------------------------------------------------");
        for (Employee elist : employeeList) {
            System.out.println(elist);
        }
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee ep1, Employee ep2) {
                Integer emp1 = ep1.getEmpId();
                Integer emp2 = ep2.getEmpId();
                if (emp1.compareTo(emp2) == 0) {
                    return emp1.compareTo(emp2);
                } else {
                    return emp1.compareTo(emp2);
                }
            }
        });
        System.out.println("--------------------------------------------------");
        for (Employee newList : employeeList) {
            System.out.println(newList);
        }

    }

}
