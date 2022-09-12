/*
Program : Switch Cases
@author : Sonu Sharma
@Date	: 9 Sep 2022
*/

class SwitchDemo {
	
	public static void main (String ...args) {
	
		int num = 10;
		
		switch(num) {
			
			case 1 : System.out.println("Monday");
					 break;
			case 2 : System.out.println("Tue");
					 break;
			case 3 : System.out.println("Wed");
					 break;
			case 4 : System.out.println("Thu");
					 break;
			case 5 : System.out.println("Fri");
					 break;
			case 6 : System.out.println("Sat");
					 break;
			case 7 : System.out.println("Sun");
					 break;
			
			default : System.out.println("Wrong Input");
		}
	}
}