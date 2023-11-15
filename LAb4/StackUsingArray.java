import java.util.*;


 // Create a class for implementing a stack using an array.
 public class StackUsingArray {

 	int array[];
 	int top;
 	int capacity;
 	
 	
 // Constructor to initialize the stack with a given size.
public StackUsingArray(int size) {
	array=new int[size];
	top=-1;
	capacity=size;
	
	
 }


 // Push an element onto the stack.
 public void push(int value) {

 		if (top+1>=capacity){
 			System.out.println("Stack is Full ");
 		}
 		else {
 			array[++top]=value;
 			System.out.println("inserted");
 			

 		}
 }

 // Pop and return the top element from the stack.
 public int pop() {
 	if (top<0){
 		System.out.println("Stack is empty");
 		return -99999999;
 	}
 	else {
 		
 		return array[top--];
 		
 	}

  }

 // Check if the stack is empty.
 public boolean isEmpty() {
 
 if (top==-1)
 	return true;
 

 return false; }

 // Peek at the top element of the stack without removing it.
 public int peek() {

return array[top];
 }


 	public static void main (String ar[]){

 		StackUsingArray stack= new StackUsingArray(5);

 		stack.push(12);
 		stack.push(14);
 		stack.push(15);

 		System.out.println("Value is "+stack.pop());
 		System.out.println("The Top Value is "+stack.peek());
 	}
 }