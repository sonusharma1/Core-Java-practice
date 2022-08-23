
/*
 *
 * *
 * * *
 * * * *
 * * * * *
*/

public class MultiDimPattern {

    static void printPattern(){

        for (int i = 0; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printPattern();
    }
}
