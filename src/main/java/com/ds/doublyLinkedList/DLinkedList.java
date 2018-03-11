package com.ds.doublyLinkedList;

public class DLinkedList {
	
	private Node head;
	private int size;
	
	public void insertAtBegining(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			size++;
			return;
		}
		node.setNext(head);
		head = node;
		size++;
	}
		
	public void insert(int data,int position) {
		if(position<0||head==null) {
			position=0;
			insertAtBegining(data);
			return;
		}
		if(position>size) {
			position=size;
		}
		Node node = new Node(data);
		Node temp = head;
		for(int i=1;i<position;i++) {
			temp = temp.getNext();
		}
		node.setNext(temp.getNext());
		node.setPrev(temp);
		temp.getNext().setPrev(node);
		temp.setNext(node);
		size++;
	}
	public void insertAtEnd(int data) {
		if(head==null) {
			insertAtBegining(data);
			return;
		}
		Node temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		Node node = new Node(data);
		temp.setNext(node);
		node.setPrev(temp);
		size++;
	}
	public void remove(int position) {
		if(position<=1||head==null) {
			position=1;
			removeAtBegining();
			return;
		}if(position>size) {
			position = size;
		}
		Node temp = head;
		for(int i=0;i<position;i++) {
			temp = temp.getNext();
		}
		if(temp.getNext()!=null) {
			temp.getNext().setPrev(temp.getPrev());
			temp.setNext(temp.getNext());
		}
		if(temp.getPrev()!=null) {
			temp.getPrev().setNext(temp.getNext());
		}
		temp =null;
		size--;
	}

	public void removeAtBegining() {
		if(head!=null) {
			head = head.getNext();
			head.setPrev(null);
			size--;
		}
	}
	public void removeAtEnd() {
		if(head!=null) {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			if(temp.getPrev()!=null)
				temp.getPrev().setNext(null);
			temp = null;
			size--;
		}
	}
	
	public String toString() {
		String sb ="{";
		Node temp = head;
		while(temp!=null) {
			sb += temp.getData()+",";
			temp = temp.getNext();
		}
		return sb+"}";
	}
	public static void main(String args[]) {
		DLinkedList list = new DLinkedList();
		System.out.println(list);
		list.insert(12, 2);
		System.out.println(list);
		list.insertAtEnd(23);
		System.out.println(list);
		list.insertAtBegining(123);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.removeAtBegining();
		System.out.println(list);
		list.removeAtEnd();
	}
}
