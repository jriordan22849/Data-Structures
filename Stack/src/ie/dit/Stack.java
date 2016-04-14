package ie.dit;

public class Stack {
	int maxSize;
	int top;
	long stackArray[];
	
	public Stack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(int x) {
		stackArray[++ top] = x;
	}
	
	public long pop() {
		return stackArray[top --];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

	
	public static void main(String[] args) {
		Stack myStack = new Stack(10);
		
		for(int i = 0; i < 5; i ++) {
			myStack.push(i);
		}
		
		
		while(!myStack.isEmpty()) {
			long value = myStack.pop();
			System.out.println(value);
		}
	}
}
