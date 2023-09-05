package basecode;

import java.util.List;

public class Employee {

    private String firstName;

    private String lastName;

    private Long empId;

    private Double salary;

    private List<String> projects;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Long empId, Double salary, List<String> projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.salary = salary;
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }
}
