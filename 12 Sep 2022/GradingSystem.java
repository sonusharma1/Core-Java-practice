/*
Program : If Else
@author : Sonu Sharma
@Date	: 12 Sep 2022
*/

class GradingSystem{

    static void printGrade() {
        int marks = 81;
        if (marks <= 25) {
            System.out.println("Fail");
        }else{

            if (marks > 25 && marks <= 45 ) {
                System.out.println("Grade : E");
            }
            else if (marks > 45 && marks <= 50 ) {
                System.out.println("Grade : D");
            }
            else if (marks > 50 && marks <= 60 ) {
                System.out.println("Grade : C");
            }
            else if (marks > 60 && marks <= 80 ) {
                System.out.println("Grade : B");
            }
            else if (marks > 80) {
                System.out.println("Grade : A");
            }
        }
    }

    public static void main(String[] args) {
        printGrade();
    }
}