/*
Program : Eligibility for admission
@author : Sonu Sharma
@Date	: 9 Sep 2022
*/

class EligibleDemo {
	
	public static void main (String ...args) {
		
		float totalMarks = Float.parseFloat(args[0]);
		float pcmMarks = Float.parseFloat(args[1]);
		
		if(totalMarks > 60) {
			
			if (totalMarks >= 80 || pcmMarks >=	 85) {			
				System.out.println("You are eligible for college");
				System.out.println("You are also eligible for B.Tech");
			}
			else
				System.out.println("You are eligible for college but not for B.Tech");
		}		

		else
			System.out.println("You are not eligible :(");
		
	}
}