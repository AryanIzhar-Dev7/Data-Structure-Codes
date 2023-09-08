public class NLArray {

    //Crop Center Method
    static  void cropcenter(int array[][]){

        for (int i=1; i<array.length-1; i++){
            for(int x=1;x<array[i].length-1;x++){
                System.out.print(array[i][x]+" " );
            }
            System.out.println();
        }
    }

    // Extract Boundries Method
   static void extractBoundries (int array [][]){

        int arrayrow= array.length;
        int arraycolum=array[0].length;

        //Printing first row
       System.out.println("Column="+arraycolum);
        for(int i=0; i<arraycolum; i++ ){
            System.out.print(array[0][i]+" ");
        }
       System.out.println();

        for (int i=1; i<array.length; i++){

            if (array[i][0]!=array[arrayrow-1][0]){
                for (int x=0; x<1; x++){
                    System.out.print(array[i][0]+" ");
                    System.out.println(array[i][arraycolum-1]+" ");
                }
            }

            else{
                //System.out.println();
                int lastrow=arrayrow-1;
                for (int a=0; a<arraycolum; a++){
                    System.out.print(array[lastrow][a]+" ");
                }
                break;
            }
        }

    }

   static boolean NConRep(int array[][]){

        int N= array.length;
        int count=0;


        for (int i=0; i<array.length; i++){
            int temp=array[i][0];

            for (int j=0; j<array.length; j++){
                if (array[i][j]==temp){
                    count++;
                }
            }

            if (count==array.length){
                return true;
            }
            else if(count< array.length){
                count=0;
            }
        }

    return false; }
    public static void main(String[] args) {
       //int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,6}};
        // extractBoundries(array);
        //cropcenter(array);

        int array[][]={{1,2,3,4},{49,5,6,74},{2,2,2,2},{64,44,147,14}};
        System.out.println(NConRep(array));

    }

    }

