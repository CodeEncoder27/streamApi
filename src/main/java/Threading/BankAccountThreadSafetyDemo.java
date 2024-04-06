package Threading;

public class BankAccountThreadSafetyDemo  {
    double balance;

    public BankAccountThreadSafetyDemo(double initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount){
        System.out.println(Thread.currentThread().getName() + "non critical" );
        synchronized (this) {
            double newBalance = balance + amount;
            System.out.println(Thread.currentThread().getName() + " is depositing " + newBalance);
            //simulating Processing time
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = newBalance;
        }
    }


    public  void withdraw(double amount){
        synchronized(this) {
            if (balance >= amount) {
                double newBalance = balance - amount;

                System.out.println(Thread.currentThread().getName() + "is withdrawing amount " + newBalance);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance = newBalance;
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccountThreadSafetyDemo account = new BankAccountThreadSafetyDemo(100);
        Thread deposit1 = new Thread(() -> account.deposit(40),"deposit1");
        Thread deposit2 = new Thread(() -> account.deposit(50),"deposit2");
        Thread withdraw1 = new Thread(() -> account.withdraw(30),"withdraw1");
        Thread withdraw2 = new Thread(() -> account.withdraw(50),"withdraw2");

        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();

        try {
            deposit1.join();
            deposit2.join();
            withdraw1.join();
            withdraw2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Final Balance: " + account.getBalance());
    }

}
