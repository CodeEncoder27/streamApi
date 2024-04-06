package Threading;

import org.springframework.util.ObjectUtils;

import java.util.Objects;
import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println(" Enter the range for which you want Thread to execute ");
            Integer n  = sc.nextInt();
            System.out.println(" Enter the range for which you want Daemon to execute ");
            Integer n1 = sc.nextInt();

            Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i <= n; i++){
                    System.out.println("Normal Thread 1 execution Started " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        Thread daemonThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 10; i++){
                    System.out.println("Daeomon Thread execution Started " + i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        t1.start();
        daemonThread.setDaemon(true);
        daemonThread.start();

    }
}
