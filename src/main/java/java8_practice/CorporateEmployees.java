package java8_practice;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CorporateEmployees {
    private String empId;
    private String empName;
    private String empLocation;
    private double empSalary;
    private String EmpGrade;
    private String departmentName;
    private List<String> empProjects;


}
