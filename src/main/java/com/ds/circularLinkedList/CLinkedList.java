package com.ds.circularLinkedList;

public class CLinkedList {
	
	private Node head;
	private int size;
	
	public void insertAtBegining(int data) {
		Node node = new Node(data);
		if(head==null) {
			head =  node;
			node.setNext(node);
			return;
		}else {
			node.setNext(head);
			Node temp = head;
			while(temp.getNext()!=head) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			head = node;
		}
		size++;
	}
	
	public void insertAtEnding(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			node.setNext(node);
		}else {
			node.setNext(head);
			Node temp = head;
			while(temp.getNext()!=head) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		size++;
	}
	
	public void deleteAtBegining() {
		if(head!=null) {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(head.getNext());
			head = head.getNext();
		}
		size--;
	}
	
	public void deleteAtEnd() {
		if(head!=null) {
			Node temp = head,prev=null;
			while(temp.getNext()!=head) {
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(head);
		}
		size--;
	}
	
	
	@Override
	public String toString() {
		String result = "";
		if(head!=null) {
			Node temp = head;
			result += temp.getData()+",";
			while(temp.getNext()!= head) {
				temp = temp.getNext();
				result += temp.getData()+",";
			}
		}
		return result;
	}

	public static void main(String args[]) {
		CLinkedList list = new CLinkedList();
		System.out.println(list);
		list.insertAtBegining(123);
		System.out.println(list);
		list.insertAtEnding(12);
		System.out.println(list);
		list.insertAtBegining(34);
		System.out.println(list);
		list.insertAtEnding(2);
		System.out.println(list);
	}
}
