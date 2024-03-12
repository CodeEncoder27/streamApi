package interfaces_prac.java8.diamondproblem;

public interface Animal {
    default void sleep(){
        System.out.println("Animals sleep in Jungle");
    }
}
