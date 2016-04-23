package ie.dit;

public class Link {
	int value;
	
	public Link next;
	
	Link(int value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println("Value in list: " + value);
	}
	
	public String toString() {
		String val =  Integer.toString(value);
		return val;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		boolean empty = list.isEmpty();
		
		//System.out.println("Is List empty: " + empty);
		//list.insertLink(10);
		//list.insertLink(20);
		//list.display();
		empty = list.isEmpty();
		System.out.println("Is List empty: " + empty);
		
		//Link removeLink = list.removeLast();
		//System.out.println(removeLink.toString());
		//list.display();
		String listString = "";
		
		for(int i = 0; i < 5; i ++) {
			list.insertLink(i);
			if(i < 5 - 1) {
				listString += i + ", ";
			} else {
				listString += i;
				
			}	
		}
		
		System.out.println(listString);
		
		empty = list.isEmpty();
		System.out.println("Is List empty: " + empty);
		
		list.reverseList();

		

	}
	
}
