import java.util.Scanner;

/*
Program : Print Duplicate Elements in array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/
public class PrintDuplicateArray {
    // creating method to take input from user
    static void inputArray() {

        Scanner sc = new Scanner(System.in);

        // taking array size
        System.out.println("Size of array");
        int arraySize = sc.nextInt();

        // declaring array
        int arr [] = new int [arraySize];
        System.out.println("Enter elements");

        // storing array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // calling method to print array elements
        System.out.println("Elements are : ");
        displayArray(arr);

        // calling method to print duplicate elements in array
        System.out.println("\nDuplicate value are : ");
        printDuplicate(arr);
    }

    static void printDuplicate(int []dArry) {
        System.out.println(dArry.length);   // 5
        for (int i = 0; i < dArry.length; i++) {
            for (int j = i+1; j < dArry.length; j++) {  // if j=6 then loop will not run because j < 5
                if (dArry[i] == dArry[j]) {
                    System.out.print(dArry[i]+" ");
                }
            }
        }
    }

    // creating method to print array
    private static void displayArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
