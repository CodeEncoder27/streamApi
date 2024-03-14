package designpatterns.creational.abstractfactory;

public class Doctors implements Profession{
    @Override
    public void display() {
        System.out.println("Hello i am Practicing Doctor");
    }
}
