package linkedlist.circulardoublelinkedlist;

public class CircularDoubleLinkedListMain {

    public static void main(String[] args){

        CircularDoubleLinkedList<Integer> cdList= new CircularDoubleLinkedList<>();
        cdList.insertAtBeginning(100);
        cdList.traverseNodes();
        cdList.insertAtBeginning(200);
        cdList.traverseNodes();
        cdList.insertAtEnd(600);
        cdList.traverseNodes();
        cdList.insertAtPosition(2,700);
        cdList.traverseNodes();
        cdList.deleteFromBeginning();
        cdList.traverseNodes();
        cdList.deleteFromEnd();
        cdList.traverseNodes();
        cdList.insertAtPosition(2,240);
        cdList.traverseNodes();
        cdList.insertAtPosition(3,400);
        cdList.traverseNodes();
        cdList.deleteFromPosition(2);
        cdList.traverseNodes();
    }
}
