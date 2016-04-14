public class LinkedList {
	
	public LinkedList firstLink;
	
	LinkedList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void insertFirstLink(String bookName, int millionsSold) {
		Link newLink = new Link(bookName,millionsSold);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public static void main(String[] args) {
		
	}
}