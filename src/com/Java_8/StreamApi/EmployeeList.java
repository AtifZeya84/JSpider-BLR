package com.Java_8.StreamApi;

import com.Java_8.Lambda._3rd.Employee;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    static void main() {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(101, "Atif", 24, 1500));
        emp.add(new Employee(102, "Sikha", 25, 2500));
        emp.add(new Employee(103, "Gaurav", 22, 8500));
        emp.add(new Employee(104, "Arif", 29, 5641));
        emp.add(new Employee(106, "Aiman", 35, 4988));
        emp.add(new Employee(107, "Raiyan", 36, 56287));
        emp.add(new Employee(108, "Faizan", 24, 56454));
        emp.add(new Employee(109, "Abhisekh", 21, 9852));
        emp.add(new Employee(110, "Kaynat", 19, 78958));
        emp.add(new Employee(111, "Zoya", 28, 56874));

        /* To print the names in list which ends with n  */
        //emp.stream().filter(e -> e.getName().endsWith("n")).forEach(e -> System.out.println("Names are " + e));

        /* To print the names in list which ends with n  */


        /* lowest salary  */
        Employee employee = emp.stream().min((t1,t2)->((t1.getSalary() < t2.getSalary()) ? -1 : ((t1.getSalary() == t2.getSalary()) ? 0 : 1))).get();
        System.out.println("Max Salary " + employee.getSalary());
        System.out.println("name of person " + employee.getName());

        /* highest salary  */
        Employee employee1 = emp.stream().max((t1,t2)->((t1.getSalary() < t2.getSalary()) ? -1 : ((t1.getSalary() == t2.getSalary()) ? 0 : 1))).get();
        System.out.println("Max Salary " + employee1.getSalary());
        System.out.println("name of person " + employee1.getName());




    }
}