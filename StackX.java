package dsa;

public class StackX {
	private char[] stackArray;
	private int top;
	private int size;
	
	public StackX(int size) {
		top = -1;
		this.size = size;
		stackArray = new char[size];
	}
	
	public void push(char ch) {
		if(isFull()) {
			System.out.println("The Stack is Full");
		}
		else {
			top++;
			stackArray[top] = ch;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return '*';
		}
		else {
			char temp = stackArray[top];
			top--;
			return temp;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return '*';
		}
		else {
			return stackArray[top];
		}	
	}
	
	public boolean isEmpty() {
		if(top == -1)	
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == size - 1)	
			return true;
		else
			return false;
	}
}
