package interfaces_prac.java8.diamondproblem;

public interface Bird {
    default void sleep() {
        System.out.println("birds sleep in nests");
    }
}
