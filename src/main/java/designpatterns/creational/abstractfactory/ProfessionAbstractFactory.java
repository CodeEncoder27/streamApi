package designpatterns.creational.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeofProfession) {
        if (typeofProfession == null){
            return null;
        } else if (typeofProfession.equalsIgnoreCase("Doctor")){
            return new Doctors();
        } else if (typeofProfession.equalsIgnoreCase("Nurses")){
            return new Nurses();
        }
        return null;
    }
}
