package java8_practice;

import basecode.Employee;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

public class LamdaPractice {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Anish", "y", 789L, 0.0, List.of("ERP", "SAP_Support")));
        employees.add(new Employee("Vikram", "P", 875L, 89.7, List.of("KAFKA", "OMEGA")));
        employees.add(new Employee("rannjith", "M", 454L, 9.0, List.of("DELTA", "PROJECT_X")));
        employees.add(new Employee("Karan", "K", 78L, 777.7, List.of("SPLUNK", "Hp")));
    }

    //Lamda Approach
    // ( o1,  o2) -> return o2.getFirstName().compareTo(o1.getFirstName());

    public List<Employee> getSortedEmployees() {
        return employees.stream().sorted(Comparator.comparing(Employee::getFirstName).reversed()).collect(Collectors.toList());
//        employees.sort((o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName()));
//        return employees;
    }

    public static List<String> getProjects(Long id) {
        return employees.stream().filter(employee -> employee.getEmpId().equals(id)).map(Employee::getProjects).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Original Employees list" + employees);
        System.out.println("Sorted Employees " + new LamdaPractice().getSortedEmployees());

        //mapping EMPId and Projects using list
        Map<Long, List<String>> map = new HashMap<>();
        if (!ObjectUtils.isEmpty(employees)) {
            employees.forEach(employee -> map.put(employee.getEmpId(), getProjects(employee.getEmpId())));
            System.out.println("mapped employees to projects" + map);
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