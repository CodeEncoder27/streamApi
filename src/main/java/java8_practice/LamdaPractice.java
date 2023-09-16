package java8_practice;

import basecode.Employee;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

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

    public static List<String> getProjects(Long id) {

        List<String> empProjects = employees.stream().filter(employee -> employee.getEmpId().equals(id)).map(Employee::getProjects).flatMap(Collection::stream).collect(Collectors.toList());
        return empProjects;
    }
    public static void main(String[] args) {

        System.out.println("Original Employees list" + employees);
        System.out.println("Sorted Employees " + new LamdaPractice().getSortedEmployees());

        //mapping EMPId and Projects
        Map<Long, List<String>> map = new HashMap<>();
        if (!ObjectUtils.isEmpty(employees)) {
            employees.forEach(employee -> map.put(employee.getEmpId(), getProjects(employee.getEmpId())));
            System.out.println(map);
        }

    }
}

//class myComparator implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o2.getFirstName().compareTo(o1.getFirstName());
//    }
//}