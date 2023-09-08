public class LinkedListPractise {


    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;   }
        }

       Node first;
        Node last;

        void addLast(int item){
            var node= new Node(item);

            if (first==null){
                first=last=node;
            }else{
                last.next=node;
                last=node;
            }
        }

        void addFirst(int item){
            var node = new Node(item);

            if (first==null){
                first=last=node;
            }
            else{
                node.next=first;
                first=node;
            }
        }

        int indexOF(int item){
            int index=0;

            var current = first;

            while(current!=null){

                if (current.value==item)
                    return index;
                   else
                       current=current.next;
                       index++;
            }
            return -1;
        }

        boolean contains(int item){

            var current = first;

            while(current!=null){
                if (current.value==item){
                    return true ;
                }
                current=current.next;
            }
        return false; }

        void removeFirst(){
            var current = first;

            if (first==null){
                System.out.println("NoSuchElementFoundEXception");
            } else if(first==last){
                first=last=null;
            }
            else{

                first=current.next;
                first.next=null;
            }
        }
        void removeLast(){

            if (last==null) System.out.println("NoSuchElementExcceptio");
            else if (last==first){              first=last=null;        }
            else {
               var current=first;

               while(current.next.next!=null){
                   current=current.next;
               }
               current.next=null;
               last=current;


            }
        }


    public static void main(String[] args) {
        var linkedlist= new LinkedListPractise();

        linkedlist.addFirst(12);
        linkedlist.addLast(13);
        linkedlist.removeLast();
        System.out.println(linkedlist.contains(13));

    }
}
