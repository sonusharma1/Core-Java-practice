/*
Program : Jagged Array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/
import java.util.Scanner;
public class JaggedArray {
    
    static void sampleArray() {

        Scanner sc= new Scanner(System.in);

        int [][] myArray = new int[3][];
        myArray[0] = new int[2];
        myArray[1] = new int[3];
        myArray[2] = new int[1];

        // taking input 
        System.out.println("Enter Elements");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray [i][j] = sc.nextInt();
            }
        }

        // displaying jagged array
        System.out.println("Matrix is :");
        for (int[] row : myArray) {
            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }        
    }

    public static void main(String[] args) {
        sampleArray();
    }
}
