package java8_practice;

import basecode.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapAndFlatMapJava8 {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Anish", "y", 789L, 0.0, List.of("ERP", "SAP_Support")));
        employees.add(new Employee("Vikram", "P", 875L, 89.7, List.of("KAFKA", "OMEGA")));
        employees.add(new Employee("rannjith", "M", 454L, 669.0, List.of("DELTA", "PROJECT_X")));
        employees.add(new Employee("Karan", "K", 78L, 777.7, List.of("SPLUNK", "Hp")));
    }

    public static List<String> getNames(){
        return employees.stream().map(Employee::getFirstName).collect(Collectors.toList());
    }

    public static void main(String[] args) {

//        List<String> getNames = employees.stream().map(Employee::getFirstName).collect(Collectors.toList());
//        System.out.println(getNames);

        List<List<String>>  getprojects =employees.stream().map(Employee::getProjects).collect(Collectors.toList());
        System.out.println(" before flatmap"+getprojects);

        List<String> flatMappedProjects = employees.stream().flatMap(employee -> employee.getProjects().stream()).collect(Collectors.toList());
        System.out.println("Flat map " + flatMappedProjects);
//        getNames().stream().forEach(System.out::println);

        Map<String, List<String>> empNameandProjectsMapped = new HashMap<>();

        employees.forEach(employee -> empNameandProjectsMapped.put(employee.getFirstName(), employee.getProjects()));

        empNameandProjectsMapped.entrySet().forEach(System.out::println);




    }
}
