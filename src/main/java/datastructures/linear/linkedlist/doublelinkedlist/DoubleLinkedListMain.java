package datastructures.linear.linkedlist.doublelinkedlist;

public class DoubleLinkedListMain {

    public static void main(String args[]){
        DoubleLinkedList<Integer> dList = new DoubleLinkedList<>();
        dList.insertAtBeginning(100);
        dList.traverseNodes();
        dList.insertAtBeginning(200);
        dList.traverseNodes();
        dList.insertAtEnd(400);
        dList.traverseNodes();
        dList.insertAtPosition(2,300);
        dList.traverseNodes();
        dList.deleteFromBeginning();
        dList.traverseNodes();
        dList.deleteFromEnd();
        dList.traverseNodes();
        dList.insertAtBeginning(500);
        dList.traverseNodes();
        dList.insertAtEnd(200);
        dList.traverseNodes();
        dList.deleteFromBeginning();
        dList.traverseNodes();
        dList.deleteFromPosition(3);
        dList.traverseNodes();
    }
}
