// Create a class for implementing a stack using a linked list.
 public class LinkedListStack {

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
 	}
 	else {

 	node.next=top;
 	top=node;
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

 // Peek at the top element of the stack without removing it.
 public int peek() {

 	return top.data;
 }


		public static void main(String[] args) {


			LinkedListStack ls= new LinkedListStack();

		// Inserting the values
			ls.push(1);
			ls.push(2);
			ls.push(3);		
			ls.push(4);
			ls.push(5);
			ls.push(6);
			ls.push(7);

			// Seeing the top value 
			System.out.println("The Top Value is : "+ls.peek());


			// Retreiving the values

			System.out.println("Retreived "+ ls.pop());
			System.out.println("Retreived "+ ls.pop());
			System.out.println("Retreived "+ ls.pop());
			System.out.println("Retreived "+ ls.pop());



}

}
 