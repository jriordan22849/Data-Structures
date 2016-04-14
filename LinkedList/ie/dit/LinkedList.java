package ie.dit;

public class LinkedList {
	public Link firstLink;
	
	LinkedList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void insertLink(String bookName, int millionsSold) {
		Link newLink = new Link(bookName, millionsSold);
		newLink.next = firstLink;
		
		firstLink = newLink;
	}
	
	public boolean findBook(String bookName) {
		Link bookLink = firstLink;
		
		if(!isEmpty()) {
			while(bookLink.bookName != bookName) {
				if(bookLink.next == null) {
					System.out.println("End of list");
					return false;
				} else {
					bookLink = bookLink.next;
				}
			}
		} else {
			System.out.println("List is empty");
		}
		return true;
		
	}
	
	public Link remvoeFirst() {
		Link link = firstLink;
		
		if(!isEmpty()) {
			firstLink = firstLink.next;
		} else {
			System.out.println("LinkedList is empty");
		}
		return link;
	}
	
	public void display() {
		Link theLink = firstLink;
		while(theLink != null) {
			theLink.display();
			theLink = theLink.next;
			
		}
	}
}
