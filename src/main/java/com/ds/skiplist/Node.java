package com.ds.skiplist;

public class Node<K extends Comparable<K>,V> {
	
	private V value;
	private K key;
	private Node<K,V> next;
	private Node<K,V> down;
	private long level;

	public Node(K key,V value,long level,Node<K,V> next, Node<K,V> down) {
		this.key = key;
		this.value = value;
		this.next = next;
		this.down =  down;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}

	public Node<K, V> getDown() {
		return down;
	}

	public void setDown(Node<K, V> down) {
		this.down = down;
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}
}
