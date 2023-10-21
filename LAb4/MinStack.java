import java.util.*;


public class MinStack {

	int min;

 	Node top;
 	class Node{
 		int data;
 		Node next;

 		Node(int data){
 			this.data = data;
 		}
 	}

 // Push an element onto the stack.
 public void push(int value) {
 
 	Node node = new Node (value);

 	if(isEmpty()){
 		top=node;
 		min=node.data;
 	}
 	else {

 	node.next=top;
 	top=node;
 	if (node.data<min){
 		min=node.data;
 	}

 	}
 }

 // Pop and return the top element from the stack.
 public int pop() {

 		int temp=top.data ;

 		top=top.next;
 		return temp;

 }

 // Check if the stack is empty.
 public boolean isEmpty() {

 	if (top==null){
 		return true;
 	}

 	return false;             
}

public int getmin(){
	return this.min;
}

 // Peek at the top element of the stack without removing it.
 public int peek() {

 	return top.data;
 }




public static void main (String ar[]){


	MinStack ms= new MinStack();

	ms.push(5);
	ms.push(7);
	ms.push(9);
	ms.push(15);
	ms.push(-1);
	ms.push(1);


	System.out.println("Minimum Value is :"+ms.min);
	}
}