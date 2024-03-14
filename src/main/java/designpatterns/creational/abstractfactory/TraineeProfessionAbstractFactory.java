package designpatterns.creational.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String typeofProfession) {
        if (typeofProfession == null){
            return null;
        } else if (typeofProfession.equalsIgnoreCase("traineeDoctor")){
            return new TraineeDoctors();
        } else if (typeofProfession.equalsIgnoreCase("traineeNurses")){
            return new TraineeNurses();
        }
        return null;
    }
}
