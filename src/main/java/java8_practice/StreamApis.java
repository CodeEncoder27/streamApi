package java8_practice;

import basecode.Employee;

import java.util.ArrayList;
import java.util.List;

public class StreamApis {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Anish", "y", 789L, 146788.0, List.of("ERP", "SAP_Support")));
        employees.add(new Employee("Vikram", "P", 875L, 58489.0, List.of("KAFKA", "OMEGA")));
        employees.add(new Employee("rannjith", "M", 454L, 25000.0, List.of("DELTA", "PROJECT_X")));
        employees.add(new Employee("Karan", "K", 78L, 15000.0, List.of("SPLUNK", "Hp")));
        employees.add(new Employee("Ravi", "M", 433L, 1000.0, List.of("Ma", "i")));
        employees.add(new Employee("kabir", "M", 463L, 2500.0, List.of("Ma", "i")));
        employees.add(new Employee("varsha", "M", 435L, 104400.0, List.of("Ma", "i")));
    }

    public static void main(String[] args) {
        //sorting custom data based on fields using streams

        employees.stream().sorted((o1, o2) -> (int) (o2.getSalary()-o1.getSalary())).forEach(System.out::println);

    }
}
