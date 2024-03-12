package designpatterns.factory;

public class MyFactoryDemo {
    public static void main(String[] args) {
        Employee e = FactoryEmployye.getInstance("Web");
        e.getSal();
    }
}
