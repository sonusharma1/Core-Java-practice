/*
Program : Clonning and copying of an array
@author : Sonu Sharma
@Date	: 16 Sep 2022
*/
public class CloneArray {

    static void cloneMethod() {

        // oginal array
        int ogArr[] = { 1, 2, 3, 4, 5 };

        // clonning array 
        int cloneArr[] = ogArr.clone();

        // copy of an array
        int copyArr[] = ogArr;

        // print original array
        System.out.println("Og array");
        printArray(ogArr);

        // print clone array
        System.out.println("\nclone array");
        printArray(cloneArr);

        // print copied array
        System.out.println("\ncopied array");
        printArray(copyArr);

        // after changing value of an og array
        ogArr[0] = 0;
        ogArr[1] = 9;

        // after changing value of og array
        System.out.println("\n--------------After changing of value --------------");
        // print original array
        System.out.println("Og array");
        printArray(ogArr);

        // print clone array
        System.out.println("\nclone array");
        printArray(cloneArr);

        // print copied array
        System.out.println("\ncopied array");
        printArray(copyArr);
    }

    static void printArray(int ...arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        cloneMethod();
    }
}
