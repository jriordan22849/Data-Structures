package ie.dit;

public class Link {
	int data;
	
	public Link next;
	
	public Link(int data) {
		this.data = data;
	}
	
	public void display() {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		Main linkedList = new Main();
		linkedList.insertLink(10);
		linkedList.insertLink(8);
		linkedList.insertLink(12);
		
		linkedList.display();

	}
	
	

}
