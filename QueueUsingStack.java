import java.util.*;
public class QueueUsingStack {
    Stack s1,s2;

    QueueUsingStack(){
        s1= new Stack();
        s2=new Stack();
    }

    public void enqueue(int data){

        s1.push(data);
        }

        public Object dequeue(){

        if (s1.empty()){
            //It will do nothing if stack one is empty
        }

        else {
            int size=s1.size();

        // In this loop all the elements of s1 will be moved to s2
        for (int i=0; i<size; i++){

            s2.push(s1.pop());
        }
      }
            Object value = s2.pop();
            return value; }



    public static void main(String[] args) {
         int[] keys = { 1, 2,3,4,5};
         QueueUsingStack q = new QueueUsingStack();

         // insert above keys
         for (int key : keys) {
         q.enqueue(key);
         }
         System.out.println(q.dequeue()); // print 1
         System.out.println(q.dequeue()); // print 2
         }



}
