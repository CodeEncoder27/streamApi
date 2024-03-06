package interfaces_prac;

public interface CompareManagerSalary extends compareSalary {
    void compareSalary(double empSal1, double empSal2);

    default String v(){
        return "";
    }
}
