package Threading;

public class MultiThreadingimDemo extends Thread {

    public void run() {

        System.out.println("Thread " + Thread.currentThread().getId() + " is running");

    }

    public Integer add(Integer a , Integer b) {
        Integer sum = a + b;
        System.out.println("sum is " + sum);
        return sum;
    }

    public static void main(String[] args) {

        int n = 8;// no of threads
        for (;;) {
            MultiThreadingimDemo demo = new MultiThreadingimDemo();
            demo.start();
        }


    }

}


