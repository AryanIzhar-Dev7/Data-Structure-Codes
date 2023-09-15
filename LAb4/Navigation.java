import java.util.*;





 public class Navigation{

// LinkedListStack Class Start
 	 class LinkedListStack {

 	Node top;
 	class Node{
 		String data;
 		Node next;

 		Node(String data){
 			this.data = data;
 		}
 	}

 // Push an element onto the stack.
 public void push(String value) {
 
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
 public String pop() {

 		String temp=top.data ;

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
 public String peek() {

 	return top.data;
 }}
/// LinkedListStack Class end





 	LinkedListStack forward,  backward;

 	public Navigation() {

 		forward= new LinkedListStack();
 		backward= new LinkedListStack();
}


 public void visitPage(String url) {
 		//LinkedListStack.Node node= new Node(url);

 	backward.push(url);

 	forward.top=null;

 }

 public void forward() {

 	if (forward.top==null){
 			System.out.println("Forward Empty ");
 		}
 		else{
 		
 		backward.push(forward.pop());
 		System.out.println("Forwarded to : "+backward.peek());
 		}


 }


	public void back() {

 		if (backward.top==null){
 			System.out.println("Backward Empty ");
 		}
 		else{
 		
 		forward.push(backward.pop());
 		System.out.println("Currently on : "+backward.peek());
 		}

 }

 public static void main (String ar[]){

 	Navigation navigate = new Navigation();

 	navigate.visitPage("www.Google.com");
 	navigate.visitPage("www.WhatsApp.com");
 	navigate.visitPage("www.FaceBook.com");
 	navigate.visitPage("www.PakistanZindabad.com");
 	navigate.visitPage("www.SadaPay.com");

 	navigate.back();
 	navigate.back();
 	navigate.forward();
 	navigate.back();
 	navigate.forward();
 	navigate.back();
 	
 	 	}

 }