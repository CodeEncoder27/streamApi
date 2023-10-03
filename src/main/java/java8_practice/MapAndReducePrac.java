package java8_practice;

import java.util.ArrayList;
import java.util.List;

public class MapAndReducePrac {

    static List<CorporateEmployees> corporateEmployees = new ArrayList<>();
    static {
        corporateEmployees.add(new CorporateEmployees("1","Anish","Pune",1000000.0,"C",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("2","Vikram","Mumbai",2000000.0,"B",List.of("KAFKA","OMEGA")));
        corporateEmployees.add(new CorporateEmployees("3","Ranjith","Bangalore",3000647.0,"B",List.of("DELTA","PROJECT_X")));
        corporateEmployees.add(new CorporateEmployees("4","Karan","Chennai",4004040.0,"A",List.of("SPLUNK","Hp")));
        corporateEmployees.add(new CorporateEmployees("5","Ravi","Pune",5560670.0,"A",List.of("ERP","SAP")));
        corporateEmployees.add(new CorporateEmployees("6","Kabir","Mumbai",6067000.0,"A+",List.of("KAFKA","OMEGA")));
    }
    public static void main(String[] args) {
        //To get the Average Salary for Employe Grade A
        double AvgSalary = corporateEmployees.stream().
                filter(corporateEmployees1 -> corporateEmployees1.getEmpGrade().equalsIgnoreCase("A"))
                .map(CorporateEmployees::getEmpSalary)
                .mapToDouble(i -> i).average().getAsDouble();

        System.out.println(AvgSalary);


    }
}
