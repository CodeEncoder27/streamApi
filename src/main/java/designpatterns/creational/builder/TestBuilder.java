package designpatterns.creational.builder;

public class TestBuilder {
    public static void main(String[] args) {
        User user = new  User.UserBuilder().setEmail("anish").setFirstName("Yerubandi").build();
        System.out.println(user);
    }
}
