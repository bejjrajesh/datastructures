package linkedlist.doublelinkedlist;

public class DoubleLinkedListMain {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.insertAtBeginning(100);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.insertAtBeginning(200);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.insertAtEnd(400);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.insertAtPosition(2, 300);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.deleteFromBeginning();
        doubleLinkedList.traverseNodes();
        doubleLinkedList.deleteFromEnd();
        doubleLinkedList.traverseNodes();
        doubleLinkedList.insertAtBeginning(500);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.insertAtEnd(200);
        doubleLinkedList.traverseNodes();
        doubleLinkedList.deleteFromBeginning();
        doubleLinkedList.traverseNodes();
        doubleLinkedList.deleteFromPosition(3);
        doubleLinkedList.traverseNodes();
    }
}
