
public class MaxHeap {
    int array[];
    int size;
    int capacity;

    MaxHeap(int size) {
        array= new int [size];
        capacity=size;

    }

    int parent(int index) {
        return (index-1)/2;
    }

    int left (int index) {
        return 2*index+1;
    }

    int right (int index) {
        return 2*index+2;
    }


    public void shiftup(int i) {
        while (i>0 && array[parent(i)]<array[i]){
            swap(parent(i),i);
            i=parent(i);
        }
    }

    public void shiftdown(int i) {
        int maxindex=i;
        int l=left(i);

        if(l<size && array[l]>array[maxindex]){
            maxindex=l;
        }
        int r=right(i);

        if(r<size && array[r]>array[maxindex]){
            maxindex=r;
        }

        if(i!=maxindex){
            swap(i,maxindex);
            shiftdown(maxindex);
        }
    }

    public void insert(int data){

        if(size==capacity){
            System.out.println("The Array is Full ");
        }
        size=size+1;
        array[size]=data;
        shiftup(size);
    }

    public int extract(){
        int reusult=array[0];
        array[0]=array[size];
        size--;
        shiftdown(0);

        return reusult;
    }

    void remove(int index){
        array[index]=array[0]+10;
        shiftup(index);
        extract();
    }

    public void changePriority(int oldpriority, int newpriority){
        int old=array[oldpriority];
        array[oldpriority]=newpriority;

        if(newpriority>old)
            shiftup(oldpriority);

        else
            shiftdown(oldpriority);
    }

    private void swap(int parent, int i) {
        int temp = array[parent];
        array[parent] = array[i];
        array[i] = temp;
    }

}
