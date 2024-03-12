package interfaces_prac.java8.diamondproblem.pratice;

import interfaces_prac.java8.diamondproblem.Animal;

public class Pigeons implements Birds,Flyer,Fly{
    public static void main(String[] args) {

        Pigeons p = new Pigeons();

        p.sleep();

        Animal a = new Pigeons();
        a.sleep();
    }
}
