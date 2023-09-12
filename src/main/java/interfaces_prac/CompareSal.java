package interfaces_prac;

public class CompareSal implements CompareManagerSalary{

    public static void main(String[] args) {
         CompareSal compareSal = new CompareSal();
         compareSal.compareSalary(8999.9, 209900.0);
    }
    @Override
    public void compareSalary(double empSal, double ManagerSal) {
            if(empSal > ManagerSal){
                System.out.println("Employee salary is greater than Manager salary");
                this.showPaySlip(empSal);
            }else{
                System.out.println("Manager salary is greater than Employee salary");
                this.showPaySlip(ManagerSal);
            }
    }

    @Override
    public void showPaySlip(double empSal) {
        System.out.println("Employee salary is " + empSal);
    }
}
