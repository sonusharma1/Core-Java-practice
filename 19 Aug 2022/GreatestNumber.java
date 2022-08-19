public class GreatestNumber {    
    public static void main(String[] args) {
        
        int first_num = Integer.parseInt(args[0]);
        int second_num = Integer.parseInt(args[1]);

        if (first_num > second_num) {
            System.out.println(first_num+" is Greater");
        }
        else if (first_num < second_num) {
            System.out.println(second_num+" is Greater");
        }
        else{
            System.out.println(first_num+" = "+second_num);
        }
    }
}
