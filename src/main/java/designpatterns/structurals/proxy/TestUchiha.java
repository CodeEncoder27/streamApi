package designpatterns.structurals.proxy;

import designpatterns.structurals.Subjects;

public class TestUchiha {
    public static void main(String[] args) {
        Subjects s = new ProxyDesignPattern();
        s.accessNotes();
    }
}
