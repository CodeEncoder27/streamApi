package java8_practice;

import basecode.Employee;
import basecode.jsonconversion.Employer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaPractice {

    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(
                new Employee("Anish","y",789L,0.0,List.of("ERP","SAP_Support"))
                );
        employees.add(
                new Employee("Vikram","P",875L,89.7,List.of("KAFKA","OMEGA"))
                );
        employees.add(
                new Employee("rannjith","M",454L,9.0,List.of("DELTA","PROJECT_X")));
        employees.add(
                new Employee("Karan","K",78L,777.7,List.of("SPLUNK","Hp"))

        );
    }

    //Lamda Approach
    // ( o1,  o2) -> return o2.getFirstName().compareTo(o1.getFirstName());

    public List<Employee> getSortedEmployees(){
        employees.sort((o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName()));
        return employees;
    }
    public static void main(String[] args) {

        System.out.println("Original Employees list" + employees);
        System.out.println("Sorted Employees " + new LamdaPractice().getSortedEmployees());
    }
}

//class myComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o2.getFirstName().compareTo(o1.getFirstName());
//    }
//}