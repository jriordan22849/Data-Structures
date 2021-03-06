package ie.dit;

public class Queue<T> {
	private class Node {
		T data;
		Node next;
	}
	
	Node node;
	Node tail;
	Node head;
	
	public Queue() {
		node = new Node();
		node.next = node;
		head = node;
		tail = null;
	}
	
	public void display() {
		Node displayNode = head;
		
		while(displayNode != displayNode.next) {
			System.out.println(displayNode.data);
			displayNode = displayNode.next;
			
		}
	}
	
	public void enQueue(T x) {
		Node newNode = new Node();
		newNode.data = x;
		newNode.next = node;
		
		if(head == node) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
	}
	
	public T deQueue() {
		T x = head.data;
		head = head.next;
		return x;
	}
	
	public boolean searchQueue(T data) {
		Node searchNode = head;
		
		while(searchNode != searchNode.next) {
			if(searchNode.data == data) {
				return true;
			} else {
				searchNode = searchNode.next;
			}
		}
		return false;
	}
	

}
