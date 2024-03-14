package designpatterns.creational.factory;

public class WebDeveloper implements Employee{
    @Override
    public int getSal() {
        int sal =  13_000_000;
        System.out.println("Getting salary for Web dev " + sal);
        return sal;
    }
}
