package ie.dit;

public class QueueMain {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new Queue<Integer>();
		
		for(int i = 0; i < 5; i ++) {
			myQueue.enQueue(i);
		}

		myQueue.display();
		myQueue.deQueue();
		System.out.println("\nDelete head");
		myQueue.display();
		boolean found = myQueue.searchQueue(3);
		System.out.println("\nIs 3 in the queue: " + found);
		
		boolean found2 = myQueue.searchQueue(10);
		System.out.println("\nIs 10 in the queue: " + found2);
		
	}
}
