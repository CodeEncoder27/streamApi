package geeksforgeeks.com;

import lombok.Setter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Setter
public class MultipleWaysToCreateObj implements Cloneable{

    MultipleWaysToCreateObj() {}

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }



    String name = "GeeksForGeeks";
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {

//        Class l = Class.forName("MultipleWaysToCreateObj");

//        MultipleWaysToCreateObj m = (MultipleWaysToCreateObj) l.newInstance();
//
//        //using clone()
//        MultipleWaysToCreateObj clone = (MultipleWaysToCreateObj) m.clone();

//        clone.setName("amn");
//        System.out.println(clone);

        //using COnstructor

        Constructor<MultipleWaysToCreateObj> c = MultipleWaysToCreateObj.class.getDeclaredConstructor();

        MultipleWaysToCreateObj m2 = c.newInstance();

        m2.setName("a");
        System.out.println(m2.name);

    }
}
