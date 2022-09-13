/*
Program : break and continue
@author : Sonu Sharma
@Date	: 13 Sep 2022
*/
public class BreakContinueDemo {
    
    static void printNumbers() {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    static void printNumbers2() {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    // unlabeled break and continue
    static void printNumbers3() {
        for (int i = 1; i <= 3; i++) {
            
            for (int j = 1; j <= 3; j++) {

                if (i == j) {
                    continue;
                }
                System.out.print(i+""+j+"   ");
            }
            System.out.println();
        }
    }

    // labeled break and continue
    static void printNumbers4() {
        outerloop : for (int i = 1; i <= 3; i++) {
            
            for (int j = 1; j <= 3; j++) {

                if (i == j) {
                    continue  outerloop;
                }
                System.out.print(i+""+j+"   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //printNumbers();
        // printNumbers2();
        // printNumbers3();
        printNumbers4();
    }
}
