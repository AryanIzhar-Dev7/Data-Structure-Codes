import java.util.Scanner;

public class MergeSort {



    public void mergeSort(int arr[]){

        if(arr.length<=1){
            return;
        }

        int middle=arr.length/2;
        int r=0;int i=0;

        int leftArray[]=new int[middle];
        int rightArray[]= new int[arr.length-middle];


        for(; i<arr.length; i++){

            if (i<middle){
                leftArray[i]=arr[i];
            }
            else{
                rightArray[r]=arr[i];
                r++;
            }

        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,arr);


    }

    private void merge(int[] leftArray, int[] rightArray, int[] arr) {

        int leftsize=arr.length/2;
        int rightsize=arr.length-leftsize;

        int i=0;// using for index of arr
        int r=0;//using for the index of rightarray;
        int l=0;//using for the index of leftarray;


        while(l<leftsize && r<rightsize){
            if(leftArray[l]<rightArray[r]){
                arr[i++]=leftArray[l++];
            }
            else{
                arr[i++]=rightArray[r++];
            }
        }

        while(l<leftsize){
            arr[i++]=leftArray[l++];
        }

        while(r<rightsize){
            arr[i++]=rightArray[r++];
        }
    }
    private void display(int arr[]){

        System.out.print("[ ");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        // Creating the Objects of Scanner Class and Mersort Class
        Scanner scanner= new Scanner(System.in);

        // Object of MergeSort Class
        var ms= new MergeSort();


        // Declaring the Array
        int arr[]=new int[10];


        // Taking Inputs from the user;
        System.out.println("Insert Random  Values in the Array :");
        for(int i=0; i<10; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("--------------Unsorted Array-----------------");

            ms.display(arr);

        System.out.println("--------------Sorted Array-------------------");
        // Sorting Array
        ms.mergeSort(arr);
        ms.display(arr);
    }
}

