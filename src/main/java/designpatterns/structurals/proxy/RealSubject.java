package designpatterns.structurals.proxy;

import designpatterns.structurals.Subjects;

import java.util.ArrayList;
import java.util.List;

public class RealSubject implements Subjects {

    private static List<String> names = new ArrayList<String>();

    static {
        names.add("Fugaku");
        names.add("shishui");
        names.add("Itachi");
        names.add("Madara");
        names.add("Izuna");
        names.add("Sasuke");
    }
    //Real Subject –
    // is a class implementing Subject and it is the concrete implementation that needs to be hidden behind a proxy.
    //in order to do this Create a proxy DP.
    @Override
    public void accessNotes() {
        System.out.print(names.toString());
    }
}
