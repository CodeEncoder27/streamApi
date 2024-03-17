package brocode.datastructures.lists.linkedlists;

import java.util.LinkedList;

import static brocode.datastructures.lists.linkedlists.LinkedlListWithClass.head;

public class TestLinkedListwithoutClass {

    public static void main(String[] args) {
        LinkedlListWithClass l = new LinkedlListWithClass();
         l = LinkedlListWithClass.insert(l, 99);
        l = LinkedlListWithClass.insert(l, 78);
        l = LinkedlListWithClass.insert(l, 5);
        l = LinkedlListWithClass.insert(l, 6);

//        LinkedlListWithClass.printList(l);
        LinkedlListWithClass list = new LinkedlListWithClass();
        head = new LinkedlListWithClass.Node(85);
        head.next = new LinkedlListWithClass.Node(15);
        head.next.next = new LinkedlListWithClass.Node(4);
        head.next.next.next = new LinkedlListWithClass.Node(20);
        System.out.println("before");
        LinkedlListWithClass.printList(list);

        head = list.reverse(head);
        System.out.println("after");
        LinkedlListWithClass.printList(list);


    }
}
