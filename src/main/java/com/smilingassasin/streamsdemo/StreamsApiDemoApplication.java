package com.smilingassasin.streamsdemo;

import basecode.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class StreamsApiDemoApplication {

//    static List<Employee> employees = new ArrayList<>();
//    String sequence = "Dog bites man";
//    static {
//        employees.add(
//                new Employee("Anish","y",789L,0.0,List.of("ERP","SAP_Support"))
//
//                );
//        employees.add(
//                new Employee("Karan","K",78L,777.7,List.of("SPLUNK","Hp"))
//
//                );
//        employees.add(
//                new Employee("Vikram","P",875L,89.7,List.of("KAFKA","OMEGA"))
//
//                );
//        employees.add(
//                new Employee("rannjith","M",454L,9.0,List.of("DELTA","PROJECT_X"))
//
//                );
//    }

  public static void main(String[] args) {
////        SpringApplication.run(StreamsApiDemoApplication.class, args);
//
//        char c[] = {'a','n','i','s','h'};
//
//        String str = new String(c);
//
//        for (int i = 0 ; i<c.length;i++){
//
//            System.out.println(c[i]);
//        }
//
//        System.out.println("chars are " + c + " string is  "  +str);
//
        //forEACH
//        employees.stream()
//                .forEach(employee -> System.out.println(employee));


//     Character c[] = { 'G', 'e', 'e', 'k', 's' };
//
//      IntStream intStream = Stream.of(c).flatMapToInt(IntStream::of);
//
//      intStream.forEach(System.out::println);



      String emcSku = "456-113-806";

      List<String> memberNames = new ArrayList<>();
      memberNames.add("456-113-806");
      memberNames.add("456-113-806");
      memberNames.add("Amitabh");
      memberNames.add("4Amitabh");
      memberNames.add("456-113-806");
      memberNames.add("Amitabh-806");
      memberNames.add("456-113-806");
      memberNames.add("456-113-806");

      long totalMatched = memberNames.stream()
              .filter((s) -> s.equalsIgnoreCase("456-113-806"))
              .count();

      System.out.println(totalMatched);

//
//
//        System.out.println("");
//        System.out.println("");
//        //Map && Collect
//       List<Employee> updEmp = employees.stream()
//                .map(employee -> new Employee(
//                        employee.getFirstName(),
//                        employee.getLastName(),
//                        employee.getEmpId(),
//                        employee.getSalary() * 2.5,
//                        employee.getProjects()
//                ))
//                .collect(Collectors.toList());
//        System.out.println(updEmp);
//
        //Filter Oprn
//        List<Employee> filteredEmp =  employees.stream()
//                .filter(employee -> employee.getSalary() > 100.0)
//                .map( employee1 -> new Employee(
//                        employee1.getFirstName(),
//                        employee1.getLastName(),
//                        employee1.getEmpId(),
//                        employee1.getSalary() * 20.0,
//                        employee1.getProjects()
//                        )
//                )
//                .collect(Collectors.toList());
//
//        System.out.println("filtered emp" + filteredEmp);
//
//        //findFirst oprn
//        Employee firstEmp = employees.stream()
//                .filter(employee -> employee.getSalary() > 900)
//                .map(employee -> new Employee(
//                        employee.getFirstName(),
//                        employee.getLastName(),
//                        employee.getEmpId(),
//                        employee.getSalary() - 15.0,
//                        employee.getProjects()
//                ))
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("  ");
//        System.out.println("first emp " + firstEmp);
//
//        //Flat Map
//        String employ = employees.stream()
//                .filter(employee -> employee.getSalary() > 100.0)
//                .map(employee1 -> employee1.getProjects())
//                .flatMap(strings -> strings.stream())
//                .collect(Collectors.joining(","));
//
//        System.out.println(" Flat map " +employ);
//
//        //short circuit oprn
//
//       List<Employee> shortcrkt =  employees.stream()
//                .skip(2)
//                .limit(2)
//                .collect(Collectors.toList());
//
//        System.out.println(shortcrkt);
//
//        //Finite oprn --> to limit the infinite data;
//
//        Stream.generate(Math::random)
//                .limit(3)
//                .forEach(val -> System.out.println("finite" +val));
//
//        //Sorting
//        List<Employee> sortedEmp = employees.stream()
//                .sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
//                .collect(Collectors.toList());
//
//        System.out.println(sortedEmp);
//
//        //Aggregation
//
//        employees.stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .orElseThrow(NoSuchElementException::new);
//
//        //Accumulation: to accumulate a entire list values.
//
//       Double totalSal = employees.stream()
//                .map(employee -> employee.getSalary())
//                .reduce(0.0,Double::sum);
//
//        System.out.println(totalSal);
//
//        //Parallel Stream
//

//try {
//    int a = args.length;
//    int b =10/a;
//    System.out.println(a);
//}catch (NumberFormatException e) {
//    System.out.println("Hello world");
//}


   }


}
class a {}
class b extends a {}

class  test{
    public static void main(String[] args) {
        List<? super a> k = new ArrayList<>();
        List<? extends b> k3 = new ArrayList<>();
        k.add(new a());

    }
}