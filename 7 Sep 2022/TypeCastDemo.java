/*
Program : Type Casting
@author : Sonu Sharma
@Date	: 7 Sep 2022
*/

class TypeCastDemo  {
	
	public static void main(String [] args) {
		
		float a = 8.2f;
		float b =  5;
		float ans = a/b;
		
		int remainder = (int) (a%b); // this is type casting to prevent lossy conversion
		
		System.out.println("Ans = "+ans);
		System.out.println("Ans = "+remainder);
		
		boolean flag = 5>4;
		System.out.println("flag = "+flag);
		
		
		//int num1 = num2 = 5; // this will throw error because we have not defined num2 
		int num1, num2;
		num1 = num2 = 5;
	}
	
}