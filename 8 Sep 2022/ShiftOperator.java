/*
Program : Shift operator // shift operator works on binaray level
@author : Sonu Sharma
@Date	: 8 Sep 2022
*/
public class ShiftOperator {
    
    public static void main(String[] args) {
        
        int a = 10, b = -10;

        // on +ve numbers
        System.out.println(a<<2);    // 40  -> left shift               // a * 2^(no of shifts)
        System.out.println(a>>2);   // 2    -> right shift              // a / 2^(no of shifts)
        System.out.println(a>>>2); // 2     -> zero fill eight shift

        // on -ve numbers
        System.out.println(b<<2);    // -40         -> left shift
        System.out.println(b>>2);   // -3           -> right shift
        System.out.println(b>>>2); // 1073741821    -> zero fill eight shift
    }
}
