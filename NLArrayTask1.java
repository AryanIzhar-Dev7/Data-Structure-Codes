
// Task 1:
        /*Create a file named NLArray.java and design following functions:
        - String [] wordTokenize (String fileName) à Read any text file and return list
        of words from that file. (Ignore . , : and all these types operators)
        - String[] extractEmail (String fileName) à Read any text file and return all
        emails from and file*/

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;

public class NLArrayTask1 {


     // Task One
   static String [] wordTokenSize(String filename){
        String processedfile="";
        String data="";

        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                data +=myReader.nextLine()+" ";
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

            for(int i=0; i<data.length(); i++){

                if (data.charAt(i)==';' || data.charAt(i)=='.' || data.charAt(i)==':'|| data.charAt(i)==','){
                    processedfile+=" ";
                }
                  else {
                    processedfile+=data.charAt(i);
                }
            }

                String [] word=processedfile.split("\\s+");




    return word; }

    static String[] extractEmail(String filename){
       String emails="";
       String data="",word="";


        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

             for (int i=0; i<data.length(); i++){
                if (data.charAt(i)!=' '){
                    word+=data.charAt(i);
                }
            else{

             if (word.contains("@")&&word.contains(".")){
                if ((word.charAt(0)!='@' && word.charAt(0)!='.' )&& (word.charAt(word.length()-1)!='@'&&  word.charAt(word.length()-1)!='.')) {
                    if (word.charAt(word.indexOf("@")+1)!='.' && word.charAt(word.indexOf(".")+1)!='@' ){
                                emails+=word+" ";
                                word="";}}
                    }
                    else{
                        word="";
                    }
                }
            }
             String [] email=emails.split("\\s+");




    return email; }

    // Task Two
    static  void cropcenter(int array[][]){

        for (int i=1; i<array.length-1; i++){
            for(int x=1;x<array[i].length-1;x++){
                System.out.print(array[i][x]+" " );
            }
            System.out.println();
        }
    }
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

    // Task Three
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

       String words[]=wordTokenSize("filename.txt");
        System.out.println("Printing: ");
        for (String n : words){
            System.out.println(n);
        }

        System.out.println("************Printing Emails **********");
        String email[]= extractEmail("filename.txt");
            for(String y:email){
                System.out.println(y);
            }


            int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Extract Boundries");
            extractBoundries(array);

        System.out.println("Crop Center");
        cropcenter(array);

        int array2[][]={{1,2,3},{6,6,6},{7,8,9}};
        NConRep(array2);

    }
}
