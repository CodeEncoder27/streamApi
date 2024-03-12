package interfaces_prac.java8.diamondproblem.pratice;

import interfaces_prac.java8.diamondproblem.Animal;

public interface Fly extends Animal {
    default void sleep() {
        System.out.println("Bid Fly ");
    }
}
