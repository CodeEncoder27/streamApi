package designpatterns.creational.abstractfactory;

public class Clients {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractfactoryProducer.getProfession(false);
        Profession profession = factory.getProfession("doctor");
        profession.display();
    }
}
