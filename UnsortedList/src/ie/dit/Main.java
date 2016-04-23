package ie.dit;

public class Main {
	public Link firstLink;
	
	Main() {
		firstLink = null;
	}
	
	public void insertLink(int value) {
		Link newLink = new Link(value);
		newLink.next = firstLink;
		firstLink = newLink;
	}

	
	public void display() {
		Link displayLink = firstLink;
		while(displayLink != null) {
			displayLink.display();
			displayLink = displayLink.next;
		}
	}

}
