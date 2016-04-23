package ie.dit;

public class LinkedList {
	
	public Link firstLink;
	
	LinkedList() {
		firstLink = null;
	}
	
	public void insertLink(int value) {
		Link newLink = new Link(value);
		newLink.next = firstLink;
		firstLink = newLink;
		
	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void display() {
		Link displayLink = firstLink;
		
		while(displayLink != null) {
			displayLink.display();
			displayLink = displayLink.next;
		}
	}
	
	public Link removeLast() {
		Link removeLink = firstLink;
		
		if(!isEmpty()) {
			firstLink = firstLink.next;
		}
		
		return removeLink;
	}
	
	public void reverseList() {
		Link reverseLink = firstLink;
		Link previousLink = null;
		Link nextLink;
		String reverse = "";
		
		while(reverseLink != null) {
			System.out.println("first Link: " + firstLink);
			nextLink = reverseLink.next;
			reverseLink.next = previousLink;
			previousLink = reverseLink;
			reverseLink = nextLink;
			System.out.println("Reverse Link: " + reverseLink);
			reverse += previousLink + ", "; 
		}
		System.out.println(reverse);
		
	}
	
	

}
