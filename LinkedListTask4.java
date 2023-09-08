public class LinkedListTask4 {

 

        public static void main(String[] args) {

            linkedlist linkedlist = new linkedlist();

            linkedlist.addFirst("11");
            linkedlist.addFirst("23");
            linkedlist.addFirst("34");
            linkedlist.addFirst("45");
            linkedlist.addFirst("56");
            linkedlist.addFirst("78");
            linkedlist.display();
            linkedlist.addLast("88");
            linkedlist.addFirst("123");
            linkedlist.addLast("434");
            linkedlist.display();

            linkedlist.addAtIndex("Aryan", 2);
            linkedlist.display();
            linkedlist.deleteFirst();
            linkedlist.display();
            linkedlist.deleteLast();
            linkedlist.display();
            linkedlist.deleteAtIndex(3);
            linkedlist.display();

            System.out.println("After Duplication");
            linkedlist copylist = linkedlist.duplicate();
            copylist.display();



        }

    }

    class linkedlist {

        private Node head;
        private int size;

        public void addFirst(Object value) {
            Node node = new Node(value);

            node.next = head;
            head = node;

            size++;
        }

        public void addLast(Object value) {

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;

            }
            Node node = new Node(value);

            curr.next = node;

            size++;
        }

        public void addAtIndex(Object value, int index) {
            if (index == 0) {
                addFirst(value);

                return;
            }
            if (index == size) {
                addLast(value);
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {

                temp = temp.next;
            }

            Node node = new Node(value);
            node.next = temp.next;
            temp.next = node;

            size++;

        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return head == null;

        }

        public void deleteFirst() {

            head = head.next;

            size--;

        }

        public void deleteLast() {

            if (size <= 1) {
                deleteFirst();
            }

            Node curr = head;

            while (curr.next.next != null) {

                curr = curr.next;

            }
            curr.next = null;
            // System.out.println(curr.value);

            size--;
        }

        void deleteAtIndex(int index) {
            if (index == 0) {
                deleteFirst();
                return;
            }
            if (index == size - 1) {
                deleteLast();
                return;
            }
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {

                curr = curr.next;

            }
            curr.next = curr.next.next;

        }

        //This piece of Code i get help from ChatGpt After Understanding the fully logics i added
        public linkedlist duplicate()
        {
            linkedlist copyList = new linkedlist();

            Node temp = head;
            Node copy = null;

            if(temp != null)
            {
                copyList.head = new Node(temp.value);
                copy = copyList.head;
                temp = temp.next;
            }

            while(temp != null)
            {
                copy.next = new Node(temp.value);
                copy = copy.next;
                temp = temp.next;
            }

            return copyList;

        }

        public void reverse() {
            Node prev = null;
            Node temp = head;
            Node next = null;

            while (temp != null) {
                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }

            head = prev;
        }

        void display() {

            Node temp = head;

            while (temp.next != null) {
                System.out.print(temp.value + " ,");
                temp = temp.next;

            }
            System.out.print(temp.value);
            System.out.println("  End  ");

        }

        private class Node {

            Object value;

            Node next;

            public Node(Object value) {

                this.value = value;
                this.next = null;
            }

        }

    }


