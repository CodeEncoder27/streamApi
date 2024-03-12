package Exceptions;

public class MyExcep {

}
class A {
    public void test() throws NullPointerException{}
}
class B extends A {
    public void test() throws RuntimeException{}
}