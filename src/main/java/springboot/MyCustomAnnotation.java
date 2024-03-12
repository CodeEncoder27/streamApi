package springboot;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

//@Service
public class MyCustomAnnotation {

    public static void main(String[] args) {
        String v = "test";
        Datatransformer d = new Datatransformer();

        System.out.println( d.convertToUpperCase(v));
    }

}
