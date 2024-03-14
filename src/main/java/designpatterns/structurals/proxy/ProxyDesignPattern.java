package designpatterns.structurals.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class ProxyDesignPattern extends RealSubject {

    private final String key = "sharingan";
    Scanner scanner = new Scanner(System.in);
    @Override
    public void accessNotes() {
        // We can perform security checks / Authentication before accessing Obj
        System.out.println("Hey User please provide me with the Uchiha password before accessing Uchiha secrets: ");
        String input = scanner.next();
        if (input != null && input.equalsIgnoreCase(key)) {
            super.accessNotes();
        } else {
            log.error("danger senju tried to access uchiha information");
        }


    }
}
