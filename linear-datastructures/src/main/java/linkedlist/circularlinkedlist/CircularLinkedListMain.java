package linkedlist.circularlinkedlist;

//Driver Program that creates Circular LinkedList, add, remove and traverse nodes.
public class CircularLinkedListMain {

    public static void main(String args[]) {

        CircularLinkedList<Integer> cList = new CircularLinkedList<>();
        cList.insertAtBeginning(100);
        cList.traverseNodes();
        cList.insertAtEnd(200);
        cList.traverseNodes();
        cList.insertAtBeginning(500);
        cList.traverseNodes();
        cList.insertAtPosition(2, 800);
        cList.traverseNodes();
        cList.deleteFromBeginning();
        cList.traverseNodes();
        cList.deleteFromEnd();
        cList.traverseNodes();
        cList.insertAtPosition(2, 300);
        cList.traverseNodes();
        cList.deleteFromPosition(2);
        cList.traverseNodes();
    }
}
