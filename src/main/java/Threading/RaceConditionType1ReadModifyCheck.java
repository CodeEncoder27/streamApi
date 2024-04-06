package Threading;

//read - modify - Write race condition Example
public class RaceConditionType1ReadModifyCheck implements Runnable {
    int shared = 0;
    @Override
    public void run() {
        //solution we can add synchornized block
        for (int i = 0; i <100_00_0; i++) {
            shared++;
        }
    }

    public int getCount() {
        return shared;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionType1ReadModifyCheck condition = new RaceConditionType1ReadModifyCheck();
        //Interleaving of thread is causing a race condition where 2 threads are reading MODIFY and WRITE
        Thread t1 =new Thread(condition);
        Thread t2 = new Thread(condition);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final value of count is: " + condition.getCount());
    }
}
