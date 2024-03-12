package designpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattern{

    // to have a one object throughout thr prog execution
    private static SingletonPattern singletonPattern;

    private SingletonPattern(){
        if (singletonPattern != null) {
            throw new RuntimeException("SingletonPattern Already initialized and u are breaking singelton");
        }

    }

    public static SingletonPattern getSingletonPattern(){
        if(singletonPattern == null){
            singletonPattern= new SingletonPattern();
        }
        return singletonPattern;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Happy path for SingletonPattern
        SingletonPattern s = SingletonPattern.getSingletonPattern();

        System.out.println(s.hashCode());

        SingletonPattern s1 = SingletonPattern.getSingletonPattern();

        System.out.println(s1.hashCode());
        // EOL for Happy path .
        //the above single pattern looks cool, but we have a problem
        // what if ,multiple thread try to access the same method.
        //Also we can break the pattern by Reflection API

        // Using reflection API to break the pattern.

            Constructor<SingletonPattern> declaredConstructor = SingletonPattern.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonPattern s3 = declaredConstructor.newInstance();
            //here we were able to break the pattern as the hascode willnot equals
            System.out.println(s3.hashCode());

            // 2 ways to avoid breaking of SingletonPattern
            // 1) thrw exceptions from constructor  
           // 2) usign enums or converting classees to enum.



    }


}
