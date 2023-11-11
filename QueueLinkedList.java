


// A linked list node 
 class Node 
{ 
 int data; // integer data 
Node next; // pointer to the next node 

public Node(int data) 
{ 
// set the data in allocated node and return the node 
 this.data = data; 
 this.next = null; 
 } 
} 
 
 public class QueueLinkedList
 { 
 private static Node rear = null, front = null; 
 
 // Utility function to remove front element from the queue and check for Queue Unde
 
 public static int dequeue() // delete at the beginning 
 { 
    
     if (QueueLinkedList.isEmpty())
         return -1;
     
     else {
      int temp=front.data;
         front= front.next;
         return temp;
     }

 } 
 
 // Utility function to add an item in the queue 
 public static void enqueue(int item) // insertion at the end 
 { 
     var node = new Node(item);
     
     if (QueueLinkedList.isEmpty()){
         front=rear=node;
     }
     else {
      
         rear.next=node;
         rear = node;
     }
 
 }

 // Utility function to return top element in a queue 
 public static int peek() 
 { 
    if (QueueLinkedList.isEmpty())
        return -999999;
    else {
     return front.data;
    }
 } 
 
 // Utility function to check if the queue is empty or not 
 public static boolean isEmpty() 
 { 
  if (rear==null ||  front==null)
      return true;
 
 return false;} 


 

    public static void main(String[] args) 
 { 
 QueueLinkedList q = new QueueLinkedList(); 
 q.enqueue(1); 
 q.enqueue(2); 
 q.enqueue(3); 
q.enqueue(4); 
 
System.out.printf("Front element is %d\n", q.peek()); 

q.dequeue(); 
 q.dequeue(); 
 q.dequeue(); 
 q.dequeue(); 
 
 if (q.isEmpty()) { 
 System.out.print("Queue is empty"); 
 } else { 
 System.out.print("Queue is not empty");


}
 
 	}
}