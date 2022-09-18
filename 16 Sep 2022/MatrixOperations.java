import java.util.Scanner;

/*
Program : Arithmetic operation (+,-,*,/) on 2D array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/

public class MatrixOperations {

    // creating method to print matrix
    private static void displayArray(int[][] arr) {

        for (int[] rows : arr) {
            for (int col : rows) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    // creating method to perform mutiplication of matrix
    static void multiplicaton(int [][] arr1, int [][] arr2) {

        int resultMatrix [][] = new int [2][2];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                for (int k = 0; k < resultMatrix.length; k++) {
                    resultMatrix [i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        displayArray(resultMatrix);
    }

    // creating method to perform Addition of matrix
    static void addition(int [][] arr1, int [][] arr2) {

        int [][] resultMatrix = new int [2][2];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                resultMatrix [i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        displayArray(resultMatrix);
    }
    
    static void inputArray() {

        Scanner sc = new Scanner(System.in);        

        int arr1 [] [] = new int [2] [2];
        int arr2 [] [] = new int [2] [2];
        System.out.println("Enter elements");

        // taking input for arr1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // taking input for arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // printing matrix
        System.out.println("Matrix 1");
        displayArray(arr1);
        System.out.println("Matrix 1");
        displayArray(arr2);

        // taking arithmetic sign to perform + - * /
        System.out.println("Enter Math sign");
        char mathSign = sc.next().charAt(0);

        switch (mathSign) {
            case '*': 
                System.out.println("Mutiplication of Matrix : ");
                multiplicaton(arr1, arr2);
                break;

            case '+': 
                System.out.println("Addition of Matrix : ");
                addition(arr1, arr2);
                break;
        
            default:
                System.out.println("Wrong Input");
                break;
        }
    }


    public static void main(String[] args) {
        inputArray();
    }
}
