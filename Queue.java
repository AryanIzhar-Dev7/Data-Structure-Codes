class Queue {

private int front;
private int rear;
private int capacity;
private int arr[];
private int size=0;

Queue(int item){

    arr= new int [item];
    capacity=item;
    rear=-1;
    front=0;
}


public void dequeue(){

            if (isEmpty()){
                System.out.println("The Queue is Empty");
            }
            else{}

        System.out.println("The Element "+arr[front]+" is removed");

        front= (front+1)%capacity;
        size--; }

public void enqueue(int item){

    if (isFull()){
        System.out.println("The Queue is Full ");

    }
    else {
        rear= (rear+1)%capacity;
        arr[rear]=item;
        size++;

    }
}

public int size(){
    return this.size;
}

public int peek(){

   return arr[front];

}


public boolean isFull(){
    if (this.size==this.arr.length)
        return true;


return false;
}


public boolean isEmpty(){

    if (size==0){
        return true;
    }

return false;
}



public static void main (String ar[]){

 Queue q = new Queue(5); 
 
 q.enqueue(1); 
 q.enqueue(2); 
 q.enqueue(3); 
 

 
 System.out.println("Front element is: " + q.peek()); 
 q.dequeue(); 
 System.out.println("Front element is: " + q.peek()); 
 
 System.out.println("Queue size is " + q.size()); 
 
 q.dequeue(); 
 q.dequeue(); 
 
 if (q.isEmpty()) 
 System.out.println("Queue Is Empty"); 
else 
System.out.println("Queue Is Not Empty"); 
} 
}
