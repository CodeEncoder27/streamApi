package interfaces_prac.java8.diamondproblem;

public class DiamondProblemSol implements Animal,Bird{

    public void sleep(){
        Animal.super.sleep();
        Bird.super.sleep();
    }

    public static void main(String[] args) {
        DiamondProblemSol sol = new DiamondProblemSol();
        sol.sleep();
    }
}
