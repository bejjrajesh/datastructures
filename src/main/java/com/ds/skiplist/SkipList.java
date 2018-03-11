package com.ds.skiplist;

import java.util.Random;

public class SkipList {
	
	private Node<String,Integer> head;
	public  Random random;
	private long size;
	private double p;
	
	
	private long level() {
		long level = 0;
		while(level<=size && random.nextDouble()<p) {
			level++;
		}
		return level;
	}
    public SkipList() {
    	head = new Node<String,Integer>(null,null,0,null,null);
    	random = new Random();
    	p = 0.5;
    	size = 0;
    	p = 0.5;
    }
    
   public void add(String key, Integer value) {
	   long level = level();
	   if(level>head.getLevel()) {
		   head = new Node<String,Integer>(null,null,level,null,head);
	   }
	   Node<String,Integer> current = head;
	   while(current!=null) {
		   if(current.getNext()==null||current.getNext().getKey().compareTo(key)>0) {
			   if(level>=current.getLevel()) {
				   Node<String,Integer> newNode = new Node<String,Integer>(key,value,current.getLevel(),current.getNext(),null);
				   current.setNext(newNode);
			   }
			   current = current.getDown();
			   continue;
		   }
		   else if(current.getNext().getKey().equals(key)) {
			   current.setValue(value);
			   return;
		   }
		   current =  current.getNext();
	   }
	   size++;
   }
    
   public Integer remove(String key) {
	   Node<String,Integer> current = head;
	   Integer value =  null;
	   while(current!=null) {
		   if(current.getNext()==null||current.getNext().getKey().compareTo(key)>=0) {
			  if(current.getNext()!=null&&current.getNext().getKey().equals(key)) {
				  value = current.getNext().getValue();
				  current.setNext(current.getNext().getNext());
			  }
			  current =  current.getDown();
			  continue;
		   }
		   current = current.getNext();
	   }
	   size--;
	   return value;
   }
   
   public Integer get(String key) {
	   Node<String,Integer> current = head;
	   while(current!=null) {
		   if(current.getNext()==null||current.getNext().getKey().compareTo(key)>=0) {
			   current = current.getDown();
				continue;
		   }
		   else if(current.getNext().getKey().equals(key)) {
			   return current.getNext().getValue();
		  }
		   current = current.getNext();
	  }
	   return null;
   }
   
   public void showList() {
	   Node<String,Integer> current = head;
	   while(current!=null) {
		   System.out.println("Key = "+current.getNext().getKey()+"\t"+"Value="+current.getNext().getValue());
		   current = current.getNext();
	   }
   }
   public static void main(String args[]) {
		SkipList skipList = new SkipList();
		skipList.add("Rajesh", 30);
		skipList.add("Sirisha", 23);
		skipList.add("Raju", 32);
		skipList.add("Kathik", 3);
		skipList.add("Ganesh", 1);
		skipList.add("Hasini",1);
		skipList.showList();
   }
}
