/*
Program : Logical operator 
@author : Sonu Sharma
@Date	: 8 Sep 2022
*/

class LogicalDemo {

	public static void main(String ...args) {
	
		boolean a=true , b=false;
		
		// logical operations
		System.out.println("AND : "+(a & b));
		System.out.println("OR : "+(a | b));
		System.out.println("XOR : "+(a ^ b));
		System.out.println("Compliment ~a : "+(!a));
		System.out.println("Compliment ~a : "+(!b+"\n"));

		int p = 10, q = 10;
		// System.out.println(++p);
		// System.out.println(q++);

		System.out.println(p++ + ++p + p++); // 10 + 12 + 12 = 34
		System.out.println(q++ + q++ + ++q); // 10 + 11 + 13 = 34
	}
}