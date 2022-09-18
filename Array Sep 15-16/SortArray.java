/*
Program : Sort elements of an array
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/
import java.util.Scanner;

public class SortArray {

    static void inputArray() {
        Scanner sc = new Scanner(System.in);

        int myArray[] = new int[5];
        System.out.println("Enter Elements");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        sortArray(myArray);
    }

    static void sortArray(int... sortedArray) {
        System.out.println();
        for (int i = 0; i < sortedArray.length - 1; i++) {

            for (int j = i+1; j < sortedArray.length; j++) {
                int temp = 0;
                if (sortedArray[i] > sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        for (int i : sortedArray) {
            System.out.printf("%d < ", i);
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
