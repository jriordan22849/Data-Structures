package ie.dit;

public class Link {
	String bookName;
	int millionsSold;
	
	public Link next;
	
	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display() {
		System.out.println(bookName + ": " + millionsSold + ",000,000 Sold"); 
	}
	
	public String toString() {
		return bookName;
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertLink("Sherlock Holmes", 8);
		linkedList.insertLink("The Avengers", 19);
		linkedList.insertLink("Lord of the Rings", 5);
		linkedList.insertLink("The Hobbit", 20);
		linkedList.display();
		
		linkedList.remvoeFirst();
		System.out.println("After deltetion");
		linkedList.display();
		
		boolean found = linkedList.findBook("The Avengers");
		System.out.println("Has the Avengers been found in the list: " + found);
		
		
		
	}
}
