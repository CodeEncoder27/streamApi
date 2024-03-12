package designpatterns.factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int getSal() {
        int sal =  7_00_000;
        System.out.println("Getting salary for Android dev " + sal);
        return sal;
    }
}
