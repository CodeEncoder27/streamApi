package java8_practice;

import basecode.Employee;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachDemo {

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

    public static List<Employee> GetGoodSalariedEmps() {
        return employees.stream().filter(i -> i.getSalary() > 25000.0).collect(Collectors.toList());
    }

    public static List<Employee> GetHighPaidOrMediumPaidEmployeesUsingFilter(String userInput) {
        return userInput.equalsIgnoreCase("high") ? employees.stream().filter(i -> i.getSalary() > 25000.0).collect(Collectors.toList()) :
                userInput.equalsIgnoreCase("low") ? employees.stream().filter(i -> i.getSalary() <= 25000.0).collect(Collectors.toList()) : Collections.emptyList();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        List<String> names = List.of("Anish", "Vikram", "Ranjith", "Karan");
        //forEAch
//        names.stream().forEach(i -> System.out.println(i));

        //filter
        names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));

        //filter employyes and collect them in a list
        System.out.println(ForEachDemo.GetGoodSalariedEmps());

        //filter employyes and collect based on input from user
        System.out.println(" ");
        do {
            System.out.println("\n Enter a value ");
            s = String.valueOf(scanner.nextLine());
            System.out.println(GetHighPaidOrMediumPaidEmployeesUsingFilter(s));
        }while(ObjectUtils.isEmpty(s));

        //count high salaried employees
       long countEmployess =  employees.stream().filter(i -> i.getSalary() > 25000).count();
        System.out.println("total  High paid Employess]" + countEmployess);


    }
}
