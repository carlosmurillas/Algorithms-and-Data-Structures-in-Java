package CS210;

public class Stack {
	
	private int maxSize;
	private char [] stackArray;
	private int top;
		 
	public Stack(int s) {
		
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	
	public void push(char j) {
		top ++;
		stackArray[top]=j;
		} 
	
	
	// take item from top of stack
	public char pop() {
	top--;
	 return stackArray[top+1];
	//access item, decrement top
	}
	
	public char peek() {

		 return stackArray[top];
		} 
	
	public boolean isEmpty() {

		 return (top == -1);
		} 
	
	public boolean isFull() {

		 return (top == maxSize-1);
		} 
	
	public void makeEmpty() {

		top=-1;

		}

	
	
}


