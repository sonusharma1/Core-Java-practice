/*
Program : If Else
@author : Sonu Sharma
@Date	: 9 Sep 2022
*/

class IfElseDemo {
	
	public static void main (String ...args) {
		
		int age = 15;
		
		if(age >= 18) 
			System.out.println("You can vote");	// we can write without curly braces only if one line has to to execute after condition	
		else
			System.out.println("Too Young");
	}
}