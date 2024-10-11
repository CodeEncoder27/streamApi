package capgemini;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Data{
    int data;
    Data(int data) {
        this.data = data;
    }

}
public class OceanQuestions {
    public static void main(String[] args) {
        Set<Data> s1 = new HashSet();
        s1.add(new Data(1));
        Set<Data> s2 = Collections.unmodifiableSet(s1);
        s2.stream().findAny().get().data = 2;
       int data = s1.stream().findAny().get().data;
        System.out.println(data);
    }
}
