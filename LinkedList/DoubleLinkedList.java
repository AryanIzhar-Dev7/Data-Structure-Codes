public class DoubleLinkedList {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }
    Node head;


    void addFirst(int data){
        var node = new Node (data);

        if (head==null){
            head=node;
        }
        else {

            head.prev=node;
            node.next=head;
            head=node;
        }

    }
    void addLast(int data){
        var node = new Node(data);

        if (head==null){
            head=node;
        }
        else{
            Node current = head;
            while (current.next!=null){
                current= current.next;
            }

            current.next=node;
            node.prev=current;
        }


    }

    void insertAt(int data,Node node){

        var current= head;

        while (current.data!=data){
            current=current.next;
        }
        node.next=current.next;
        node.prev=current;
        current.next.prev=node;
        current.next=node;

    }

    void insertbefore(int data,Node node){

        var current= head;

        while (current.data!=data){
            current=current.next;
        }

        node.prev=current.prev;
        current.prev.next=node;
        node.next = current;
        current.prev=node;

    }

    public static void main(String[] args) {
        DoubleLinkedList dl= new DoubleLinkedList();
        Node newnode= new Node(1002);
        Node n= new Node(10302);
        dl.addFirst(34);
        dl.addFirst(12);

        dl.addLast(44);
        dl.insertAt(12,newnode);
        dl.insertbefore(1002,n);

        Node current= dl.head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;

        }
    }

}
