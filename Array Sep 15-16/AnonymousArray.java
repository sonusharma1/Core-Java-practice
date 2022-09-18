/*
Program : Anonymous array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/

public class AnonymousArray {

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        printArray(new int[] {1, 2, 3, 4}); // this is called as anonymous array
    }
}
