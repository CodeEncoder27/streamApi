package Threading;

public class RaceCondition2CheckThenAct implements Runnable {

     int balance = 100;
    @Override
    public void run() {
        System.out.println("Waiting for withdrawal " + Thread.currentThread().getName());
        if (balance >= 100) {
            System.out.println("withdrawign balance " + Thread.currentThread().getName());
            balance -= 50;
        } else {
            System.out.println("withdrawal not done due to insufficient balance " + Thread.currentThread().getName());

        }
        System.out.println("Final balance " + balance);
    }

    public static void main(String[] args) {
        RaceCondition2CheckThenAct raceCondition = new RaceCondition2CheckThenAct();
        Thread anish = new Thread(raceCondition, "anish");
        Thread chandrika = new Thread(raceCondition, "chandrika");
        chandrika.start();
        anish.start();

    }
}
