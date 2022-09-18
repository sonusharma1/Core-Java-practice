/*
Program : update elements of an array
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/
import java.util.Scanner;
public class UpdateArray {
    
    static Scanner sc = new Scanner(System.in);
    static void inputArray() {

        int myArray[] = new int[5];
        System.out.println("Enter Elements");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        updateElement(myArray);
    }

    static void updateElement(int ...arr) {
        System.out.println("\nWhich element you want to update");
        int targetValue = sc.nextInt();
        System.out.println("\nEnter new element");
        int newValue = sc.nextInt();
        int position = -1;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            arr[position] = newValue;
        }
        else{
            System.out.println("Number not found");
        }

        System.out.println("\nAfter update");
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
