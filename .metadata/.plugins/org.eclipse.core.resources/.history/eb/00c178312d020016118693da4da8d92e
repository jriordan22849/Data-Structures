package ie.dit;

public class LinkedList {
	public Link firstLink;
	
	LinkedList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void insertLink(int value) {
		Link newLink = new Link(value);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public void display() {
		Link displaylink = firstLink;
		while(displaylink != null) {
			displaylink.display();
			displaylink = displaylink.next;
		}
	}
	
	public int addList(int postion) {
		Link value = firstLink;
		int count = 0;
		int ans;
		while(value != null) {
			if(count == postion) {
				break;
			}
			value = value.next;
			count ++;
		}
		ans = value.value;
		return ans;
	}

}
