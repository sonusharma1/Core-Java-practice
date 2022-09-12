/*
Program : If Else
@author : Sonu Sharma
@Date	: 9 Sep 2022
*/

class IfElseDemo2 {
	
	public static void main (String ...args) {
		
		int a = 14, b = 15, c = 15;
		
		if(a == b && b == c) 
			System.out.println("All are Equals");	// we can write without curly braces only if one line has to to execute after condition	
		
		else if (b < a && a > c)
			System.out.println(a+" = a is greater");
		
		else if (a < b && b > c)
			System.out.println(b+" = b is greater");
		
		else
			System.out.println(c+" = c is greater");
	}
}