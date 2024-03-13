package designpatterns.abstractfactory;

public class AbstractfactoryProducer {

    public static AbstractFactory getProfession(Boolean istrainee){
        if(istrainee){
            return new TraineeProfessionAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }
    }

}
