package com.ds.linkedList;

public class LinkedList {

	private Node head;
	private int size;
	
	public void insertAtBegining(Node node) {
		if(head==null) {
			head = node;
		}else {
			node.setNext(head);
			head= node;
		}
		size++;
	}
	public void insertAtEnd(Node node) {
		if(head==null) {
			head = node;
		}else {
			Node temp =head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		size++;
	}
	public void insert(Node node,int position) {
		if(head==null) {
			head = node;
		}
		if(position<0) {
			position = 0;
		}else if(position>size) {
			position = size;
		}
		if(position==0) {
			node.setNext(head);
			head = node;
		}
		Node temp = head;
		for(int i=1;i<position-1;i++) {
			temp = temp.getNext();
		}
		node.setNext(temp.getNext());
		temp.setNext(node);
		size++;
	}
	public Node removeFromBegining() {
		if(head == null) {
			return null;
		}else {
			Node temp = head;
			head = temp.getNext();
			size--;
			return temp;
		}
	}
	public Node removeFromEnd() {
		if(head==null) {
			return null;
		}
		else {
			Node temp = head,prevTemp=temp;
			if(head.getNext()==null) {
				head =null;
				return temp;
			}
			while(temp.getNext()!=null) {
				prevTemp = temp;
				temp = temp.getNext();
			}
			prevTemp.setNext(null);
			size--;
			return temp;
		}
	}
	public void removeMatched(Node node) {
		if(head==null) {
			return;
		}
		else if(head.equals(node)){
			head = head.getNext();
			return;
		}
		Node temp = head.getNext(),preNode=head;
		while(temp!=null) {
			if(temp.getData()==node.getData()) {
				preNode.setNext(temp.getNext());
			}
			preNode = temp;
			temp = temp.getNext();
		}
	}
	public void remove(int position) {
		if(position<0) {
			position=0;
		}
		if(position>size) {
			position=size;
		}
		if(head==null) {
			return;
		}
		Node temp = head;
		for(int i=1;i<position-1;i++) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
	}
	@Override
	public String toString() {
		String result ="[";
		if(head==null) {
			result+="]";
			return result;
		}
		for(Node temp = head;temp!=null;temp=temp.getNext()) {
			result += temp.getData()+",";
		}
		return result+"]";
	}
	
	public static void main(String args[]) {
	try{ 
		LinkedList list = new LinkedList();
		list.insertAtBegining(new Node(12));
		System.out.println(list);
		list.insertAtEnd(new Node(32));
		System.out.println(list);
		list.insertAtEnd(new Node(34));
		System.out.println(list);
		list.insertAtEnd(new Node(54));
		System.out.println(list);
		list.insert(new Node(22), 3);
		System.out.println(list);
		list.removeFromBegining();
		System.out.println(list);
		list.removeFromEnd();
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.removeMatched(new Node(32));
		System.out.println(list);
		list.removeMatched(new Node(22));
		System.out.println(list);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
  }
}
