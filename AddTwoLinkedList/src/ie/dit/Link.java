package ie.dit;

public class Link {
	int value;
	
	public Link next;
	public static Link ans;
	
	
	public Link(int value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i = 0; i < 5; i ++) {
			list.insertLink(i);
		}
		System.out.println("\nList 1");
		list.display();

		LinkedList list2 = new LinkedList();
		for(int i = 5; i < 10; i ++) {
			list2.insertLink(i);
		}
		System.out.println("\nList 2");
		list2.display();
		
		LinkedList list3 = new LinkedList();
		int num = 0;
		int num2 = 0;
		int answer;
		int index = 0;
		
		while((index < list.sizeOfList()) || (index < list2.sizeOfList())) {
			num = list.addList(index);	
			num2 = list2.addList(index);
			answer = num + num2;
			list3.insertLink(answer);
			index ++;
		}
//		for(int i = 0; i < list.sizeOfList(); i ++) {
//			num = list.addList(i);	
//			num2 = list2.addList(i);
//			answer = num + num2;
//			list3.insertLink(answer);
//		}
		System.out.println("\nList 3");
		list3.display();

		
		
	}
	
	
}
