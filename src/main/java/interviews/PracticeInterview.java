package interviews;

import java8_practice.CorporateEmployees;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class PracticeInterview {

    static List<CorporateEmployees> corporateEmployees = new ArrayList<>();
    static {
        corporateEmployees.add(new CorporateEmployees("1","Anish","Pune",50000.0,"C",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("2","Vikram","Mumbai",2000000.0,"B",List.of("KAFKA","OMEGA")));
        corporateEmployees.add(new CorporateEmployees("3","Ranjith","Bangalore",3000647.0,"B",List.of("DELTA","PROJECT_X")));
        corporateEmployees.add(new CorporateEmployees("4","Karan","Chennai",4004040.0,"A",List.of("SPLUNK","Hp")));
        corporateEmployees.add(new CorporateEmployees("5","Ravi","Pune",5560670.0,"A",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("6","Kabir","Mumbai",6067000.0,"A+",List.of("KAFKA","OMEGA")));
    }
    public static void main(String[] args) {
        //Finding duplicate elements in list using java 8
        List<String> v = Arrays.asList("Pune","Mumbai","Delhi","Pune","Bangalore","Mumbai","Pune");
        //Using set to get the duplicates
        Set<String> UniqueValues = new HashSet<>();
        Set<String> duplicates = v.stream().filter(i -> !UniqueValues.add(i)).collect(Collectors.toSet());
        duplicates.stream().forEach(System.out::println);

        //Using Map to get the count of duplicate literal

        Map<String,Long> dupMap = v.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("***********************************************");
        dupMap.entrySet().stream().forEach(System.out::println);

//        double AbsoluteIncrease = corporateEmployees.stream().map(i -> i.getEmpSalary() * 10.0 / 100).mapToDouble(i -> i).;
//        double newSal = corporateEmployees.stream().map(i -> i.getEmpSalary() * 10.0 / 100).count() + AbsoluteIncrease;

        //for the given employee who's Grade is C apply hike percent of 10
        List<CorporateEmployees> updatedSalary = corporateEmployees.stream().filter(corporateEmployees1 -> corporateEmployees1.getEmpGrade().equals("C"))
                .map(e -> new CorporateEmployees(
                        e.getEmpId(), e.getEmpName(), e.getEmpLocation(), e.getEmpSalary() * 0.50, e.getEmpGrade(), e.getEmpProjects()
                )).collect(Collectors.toList());
        System.out.println("Updated After Hike " + updatedSalary);

    }
}
