import java.util.Scanner;

/*
Program : 2D Array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/

public class Array2D {
    
    static void inputArray() {

        Scanner sc = new Scanner(System.in);
        int rows = 0, col = 0;

        System.out.println("No of rows");
        rows = sc.nextInt();
        System.out.println("No of columns");
        col = sc.nextInt();

        int arr [] [] = new int [rows] [col];
        System.out.println("Enter elements");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements are");
        displayArray(arr);
    }

    private static void displayArray(int[][] arr) {

        for (int[] rows : arr) {
            for (int col : rows) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
