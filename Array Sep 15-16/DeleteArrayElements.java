/*
Program : Delete element of an array
@author : Sonu Sharma
@Date	: 15 Sep 2022
*/
import java.util.Scanner;

public class DeleteArrayElements {
    
    static Scanner sc = new Scanner(System.in);
    
    static void inputArray() {

        int myArray[] = new int[5];
        System.out.println("Enter Elements");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        deleteElement(myArray);
    }

    static void deleteElement(int ...arr) {
        System.out.println("\nWhich element you want to delete");
        int targetValue = sc.nextInt();
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
            for (int i = position+1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
        }
        else {
            System.out.println("Number not Found");
        }
        
        System.out.println("After deletion");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        inputArray();
    }
}
