package brocode.datastructures.lists.linkedlists;

public class TestLinkedListwithoutClass {

    public static void main(String[] args) {
        LinkedlListWithClass l = new LinkedlListWithClass();
         l = LinkedlListWithClass.insert(l, 99);
        l = LinkedlListWithClass.insert(l, 78);
        l = LinkedlListWithClass.insert(l, 5);
        l = LinkedlListWithClass.insert(l, 6);

        l.printList(l);

    }
}
