import java.sql.SQLOutput;

public class Heap {

    int h[];
    int index = 0;
    int size = 0;
    int capacity = 0;

    private Heap(int size) {
        h = new int[size];
        index = -1;
        capacity = size;
        this.size = 0;
    }

    void swap(int i, int p) {
        int temp = h[p];
        h[p] = h[i];
        h[i] = temp;
    }


    void bubbleUp() {

        var i = index;

        while (i > 0 && h[parent(i)] < h[i]) {
            swap(i, parent(i));
            i = parent(i);
        }

    }

    private int parent(int index) {
        return (index - 1) / 2;
    }


    public void insert(int data) throws IllegalAccessException {
        if (index == -1)
            h[++index] = data;

        else if (isFull()) {
            throw new IllegalAccessException();
        } else {
            h[index] = data;
            bubbleUp();
        }

            size++;
        System.out.println("Inserted");
    }

        public boolean isFull(){
        return size==capacity;  }
    public static void main(String[] args) throws Exception {
        var heap=new Heap(4);

        heap.insert(2);
        heap.insert(5);
        heap.insert(1);
        heap.insert(8);


    }
}
