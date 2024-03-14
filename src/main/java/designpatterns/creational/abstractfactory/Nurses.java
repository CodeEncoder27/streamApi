package designpatterns.creational.abstractfactory;

public class Nurses implements Profession{
    @Override
    public void display() {
        System.out.println("Hello I am chief nurse");
    }
}
