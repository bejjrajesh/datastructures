package linkedlist.singlelinkedlist;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void insertAtBeginning(T data) {
        System.out.println("Inserting " + data + " at the beginning");
        Node<T> node = new Node<>(data);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void insertAtTail(T data) {
        System.out.println("Inserting " + data + " at the end");
        Node<T> node = new Node<>(data);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void insertAtPosition(int position, T data) {
        System.out.println("Inserting " + data + " at the position " + position);
        Node<T> node = new Node<>(data);
        if (head == null && tail == null) {
            System.out.println("List is Empty and Can not insert value at position " + position);
        } else if (position < 0 || position > size) {
            System.out.println("Invalid position specified " + position);
        } else {
            Node tempNode = head;
            for (int i = 1; i < position - 1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
    }

    public void traverseNodes() {
        Node<T> tempNode = head;
        System.out.println();
        while (tempNode != null) {
            System.out.print(" | " + tempNode.getData() + " | ");
            tempNode = tempNode.getNext();
        }
        System.out.println("\n");
    }


    public void search(T data) {
        System.out.println("\nSearching for node wit value : " + data);
        Node<T> tempNode = head;
        boolean isFound = false;
        int index = 1;
        while (tempNode != null) {
            if (tempNode.getData().equals(data)) {
                isFound = true;
                break;
            }
            tempNode = tempNode.getNext();
            index++;
        }
        if (isFound) {
            System.out.println("\nNode with value " + tempNode.getData() + " found at index " + index);
        } else {
            System.out.println("\nNode not found in the list!!");
        }
    }

    public void deleteFromBeginning() {
        System.out.println("Deleting node from beginning");
        if (head == null && tail == null) {
            System.out.println("List is Empty!!");
        } else {
            //Move the head pointer one step ahead.
            head = head.getNext();
            // Corner case where there is only one node and head points to null, but tail still points to only one node. So reset tail, if head is null
            if (head == null) {
                tail = null;
            }
        }
    }

    // Traver the list until last but not one node and set its next pointer to null.
    public void deleteFromEnd() {
        System.out.println("Deleting node from end");
        if (head == null && tail == null) {
            System.out.println("List is Empty!!");
        } else {
            Node tempNode = head;
            while (tempNode.getNext() != tail) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            tail = tempNode;
        }
    }

    public void deleteFromPosition(int position) {
        System.out.println("Deleting node from " + position + " position in the list");
        if (head == null && tail == null) {
            System.out.println("List is Empty!!");
        } else if (position < 0 || position > size) {
            System.out.println("Invalid position specified " + position);
        } else {
            Node tempNode = head;
            for (int i = 0; i < position - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
    }

    public void destroyList() {
        head = tail = null;
    }
}
