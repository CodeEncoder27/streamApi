package brocode.datastructures.lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListvsArraylist {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();

        long start ;
        long end ;
        long elapsed;

        for (int i = 0; i< 1000000;i++){
            list.add(i);
            array.add(i);
        }

        System.out.println("*******************LinkedList************");
        start   = System.nanoTime();

//        list.get(0);
//        list.get(999999);
//          list.remove(0);
//        list.remove(500000);
        list.remove(999999);

        end = System.nanoTime();

        elapsed = end - start;

        System.out.println("linked list " + elapsed + " ns");
        System.out.println("*******************ArrayList************");

        start   = System.nanoTime();

//        array.get(0);
//        array.get(999999);
//        array.remove(0);
//        array.remove(500000);
        array.remove(999999);

        end = System.nanoTime();

        elapsed = end - start;

        System.out.println("array list " + elapsed + " ns");

    }

}


