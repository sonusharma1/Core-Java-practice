import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Program : Remove Duplicate Elements from array
          Input = [1, 3, 1, 2, 1, 3, 2, 3, 1, 4]    Output = [1, 2, 3, 4]
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/
public class RemoveDuplicateArray {

    // creating method to take input from user
    static void inputArray() {

        Scanner sc = new Scanner(System.in);

        // taking array size
        System.out.println("Size of array");
        int arraySize = sc.nextInt();

        // declaring array
        int arr[] = new int[arraySize];
        System.out.println("Enter elements");

        // storing array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting array
        Arrays.sort(arr);

        // calling method to print array
        System.out.println("Elements are : ");
        displayArray(arr);

        // calling method to count new size of array after removing duplicates
        int newSize = countDuplicates(arr);

        // calling method to remove duplicate element in array
        System.out.println("\nNew Array value are : ");
        removeDuplicate(newSize, arr);
    }

    // creating method to count how many elements has left after removing duplicate
    // values
    static int countDuplicates(int[] arr) {

        int newSize = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                newSize++;
            }
        }
        return newSize + 1; // +1 because last element of array has left
    }

    // creating method to store non duplicate values in new array
    static void removeDuplicate(int newSize, int[] dArry) {

        int index = 0,
            tempArray[] = new int[newSize];

        for (int i = 0; i < dArry.length - 1; i++) {

            if (dArry[i] != dArry[i + 1]) {
                tempArray[index] = dArry[i];
                index++;
            }
        }

        // adding last value of dArray into tempArray
        tempArray[index] = dArry[dArry.length - 1];

        displayArray(tempArray);
    }

    // creating method to print array
    private static void displayArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
