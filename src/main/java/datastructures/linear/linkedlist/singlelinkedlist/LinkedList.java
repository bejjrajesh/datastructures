package datastructures.linear.linkedlist.singlelinkedlist;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtBegining(T data) {
        System.out.println("\nInserting "+data+" at the beginning\n");
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
        System.out.println("\nInserting "+data+" at the end\n");
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
        System.out.println("Inserting "+data+" at the position "+position+"\n");
        Node<T> node = new Node<>(data);
        if (head == null && tail == null) {
            System.out.println("List is Empty and Can not insert value at position " + position);
        } else if (position < 0 || position > size) {
            System.out.println("Invalid position specified " + position);
        } else {
            Node tempNode = head;
            for (int i = 1; i < position-1; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
    }

    public void traverseNodes() {
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.print(" | "+tempNode.getData());
            tempNode = tempNode.getNext();
        }
        System.out.print(" |");
        System.out.println("\n");
    }

    public void deleteFromBegining() {
        System.out.println("Deleting node from beginning");
        if (head == null && tail == null) {
            System.out.println("List is Empty!!");
        } else {
            head = head.getNext();
        }
    }


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
        System.out.println("Deleting "+position+"th node from the list");
        if (head == null && tail == null) {
            System.out.println("List is Empty!!");
        } else if (position < 0 || position > size) {
            System.out.println("Invalid position specified " + position);
        } else {
            Node tempNode = head;
            for(int i=0;i<position-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
    }
    public void destroyList(){
        head = tail = null;
    }
}
