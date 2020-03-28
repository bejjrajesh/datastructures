package datastructures.linear.linkedlist.circularlinkedlist;

public class CircularLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void insertAtBeginning(T data) {
        System.out.println("\nInserting Node at Beginning");
        Node node = new Node(data);
        if (head == null) {
            node.setNext(node);
            head = tail = node;
        } else {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        }
        size++;
    }

    public void insertAtEnd(T data) {
        System.out.println("\nInserting Node at end");
        Node node = new Node(data);
        if (tail == null) {
            node.setNext(node);
            head = tail = node;
        } else {
            node.setNext(head);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void insertAtPosition(int position, T data) {
        System.out.println("\nInserting Node at position " + position);
        Node node = new Node(data);
        if (head == null || tail == null) {
            System.out.println("List Empty and can't inser data at position " + position);
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        size++;
    }

    public void deleteFromBeginning() {
        System.out.println("\nDeleting from Beginning");
        if (head == null) {
            System.out.println("List is Empty!!");
        } else {
            tail.setNext(head.getNext());
            head = head.getNext();
        }
        size--;
    }

    public void deleteFromEnd() {
        System.out.println("\nDeleting Node from end");
        if (tail == null) {
            System.out.println("List is Empty!!");
        } else {
            Node temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
            tail.setNext(null);
            temp.setNext(head);
            tail = temp;
        }
        size--;
    }

    public void deleteFromPosition(int position) {
        System.out.println("\nDeleting Node from position " + position);
        if (head == null || tail == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        size--;
    }

    public void traverseNodes() {
        Node temp = head;
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" | " + temp.getData() + " | ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
