import java.util.*; 
 
 class Stack 
{ 
private int arr[]; 
 private int top; 
private int capacity; 
 
// Constructor to initialize stack 
 Stack(int size) 
{ 
 arr = new int[size]; 
 capacity = size; 
 top = -1; 
 } 
 
 // Utility function to add an element x in the stack and check for stack overflow 
 public void push(int x) 
 { 
 // Write your code here 
 } 
 
// Utility function to pop top element from the stack and check for stack underflow
 
 public int pop() 
 { 
 // Write your code here 

 } 
 
 // Utility function to return top element in a stack 
 public int peek() 
 { 
 // Write your code here 
 } 
 
 // Utility function to return the size of the stack 
 public int size() 
 { 
// Write your code here 
 } 
 
 // Utility function to check if the stack is empty or not 
 public Boolean isEmpty() 
 { 
 // Write your code here 
 } 
 
 // Utility function to check if the stack is full or not 
 public Boolean isFull() 
 { 
 // Write your code here 
 } 
 
 public static void main (String[] args) 
 { 
 Stack stack = new Stack(3); 
 
 stack.push(1); // Inserting 1 in the stack 
 stack.push(2); // Inserting 2 in the stack 
 
 stack.pop(); // removing the top 2 
 stack.pop(); // removing the top 1 
 
 stack.push(3); // Inserting 3 in the stack 
 
 System.out.println("Top element is: " + stack.peek()); 
 System.out.println("Stack size is " + stack.size()); 
 
 stack.pop(); // removing the top 3 
 
 // check if stack is empty 
 if (stack.isEmpty()) 
 System.out.println("Stack Is Empty"); 
 else 
 System.out.println("Stack Is Not Empty"); 
 } 
	 } 