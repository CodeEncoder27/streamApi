package brocode.datastructures;

import java.util.*;

public class QueueDs {

    public static void main(String[] args) throws InterruptedException {
        //Queue -> FIFO Data Structure First-In-First-Out.
        //  A Collection designed for holding elements.
        // Linear Data Structure.

        // enqueue = offer(); -- for add elements at the end(tail) of queue.
        // dequeue = poll(); -- for remove elements at the top(head) of queue.
        Queue<String> queue = new LinkedList<>();
        queue.offer("enqueue");
        queue.offer("dequeue");
        queue.offer("myname");
        queue.offer("f");

        System.out.println("initial " +queue);

//        List<String> values = new ArrayList<>();
//
//        for (int i = 0; i <=queue.size(); i++){
//            values = Collections.singletonList(queue.poll());
//        }
//        values.forEach(System.out::println);

        //where are queues used?
        //-> Keyboard Buffer() should appear on the screen in the order they're pressed
        //-> Printer queue.
        //-> priority queue, Breadth first search.

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
            Thread.sleep(5000);
        }






    }
}
