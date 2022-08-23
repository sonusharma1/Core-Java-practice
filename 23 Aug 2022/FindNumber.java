/*
Program: Find the number in Array list
@author: Sonu Sharma
@Date: 23 Aug 2022
*/

public class FindNumber {
    
    static void checkNumber(int num){

        int [] numberList = {25, 65, 21, 89, 32, -2};
        boolean result = false;

        for (int i = 0; i < numberList.length; i++) {
            
            if (num == numberList[i]){ 
                result = true;
                break;
            }
        }

        if (result) {
            System.out.println("Number Found :)");
        }
        else{
            System.out.println("Number Not Found :(");
        }

    }

    public static void main(String[] args) {
        checkNumber(Integer.parseInt(args[0]));
    }
}
