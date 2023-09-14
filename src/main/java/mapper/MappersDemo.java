package mapper;

import basecode.Employee;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;




public class MappersDemo {

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

    public static void main(String[] args) {

    }
}
