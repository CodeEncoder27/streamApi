package java8_practice;

import basecode.Employee;
import org.modelmapper.Converters;

import java.util.*;
import java.util.stream.Collectors;

public class MapsUsingLamda {

    static Map<Employee,Integer> employeeMap = new TreeMap<>((o1, o2) -> o2.getSalary().compareTo(o1.getSalary()));
    static {
        employeeMap.put(new Employee("Anish","y",789L,0.0,List.of("ERP","SAP_Support")),1);
        employeeMap.put(new Employee("Vikram", "P", 875L, 89.7, List.of("KAFKA", "OMEGA")), 5);
        employeeMap.put(new Employee("rannjith","M",454L,9.0,List.of("DELTA","PROJECT_X")),7);
        employeeMap.put(new Employee("Karan","K",78L,777.7,List.of("SPLUNK","Hp")),9);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("eight",8);
        map.put("five",5);
        map.put("seven",7);
        map.put("four",4);
        map.put("nine",9);
        map.put("one",1);


        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        //sorting traditionally,
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Map.Entry<String,Integer> entry: entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //Sorting a map using java 8
        System.out.println("Sorting a map using java 8");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //Sorting Employee Object using Maps
        System.out.println("Sorting Employee Object using Maps ");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getFirstName).reversed())).forEach(System.out::println);
    }
}
