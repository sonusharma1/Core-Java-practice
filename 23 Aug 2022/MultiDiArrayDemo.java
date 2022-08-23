

public class MultiDiArrayDemo {
    
    static void printArray(){

        int myArray [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(myArray[i][j]+"    ");
            }
            System.out.println();
        }

        for (int[] arrayRow : myArray) {
            for (int arrayCol : arrayRow) {
                System.out.print(arrayCol+"     ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        printArray();
    }
}
