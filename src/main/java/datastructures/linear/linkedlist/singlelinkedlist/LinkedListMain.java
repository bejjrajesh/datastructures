package datastructures.linear.linkedlist.singlelinkedlist;

public class LinkedListMain {

    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtBegining(100);
        list.traverseNodes();
        list.insertAtBegining(200);
        list.traverseNodes();
        list.insertAtTail(300);
        list.traverseNodes();
        list.insertAtPosition(2,34);
        list.traverseNodes();
        list.insertAtPosition(1,34);
        list.traverseNodes();
        list.deleteFromBegining();
        list.traverseNodes();
        list.deleteFromEnd();
        list.traverseNodes();
        list.deleteFromPosition(1);
        list.traverseNodes();
        list.destroyList();
    }
}
