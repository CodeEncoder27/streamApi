package designpatterns.factory;

public class FactoryEmployye {

    public static Employee getInstance(String type) {
        if (type.trim().equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        } else if (type.trim().equalsIgnoreCase("Web")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
