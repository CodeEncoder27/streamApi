package brocode.datastructures.lists.linkedlists;

import org.w3c.dom.Node;

public class LinkedlListWithClass {

    Node head;

    static class Node {


        int data;
        Node next;

        Node( int d){
            data = d ;
            next =null;
        }
    }

    public static LinkedlListWithClass insert(LinkedlListWithClass list, int data){

        //create new node
        Node newNode = new Node(data);

        //if linkedlist is empty
        //make newnode as head
        if(list.head == null){
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next !=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;

    }

    public static void printList(LinkedlListWithClass l) {
        Node current = l.head;

        while (current!= null){
            System.out.println(current.data + " " );
            current = current.next;
        }


    }

    //deleting from list

    public static LinkedlListWithClass delete(LinkedlListWithClass l, int key){
        //search fro key
        //case 1) if key is found at head node
        //  change headnode to next node
        //case 2 ) if key is found at middle/last
        //     keep track of the previous node and change the current node to next
        Node current = l.head, prev= null;
        if (current!= null && current.data == key){
            l.head = current.next;
        }

        while (current!=null && current.data != key){
            prev = current;
            current =current.next;
        }

        return null;
    }

}
