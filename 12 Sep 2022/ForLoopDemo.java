/*
Program : for loop
@author : Sonu Sharma
@Date	: 12 Sep 2022
*/

class ForLoopDemo {
	
	static void printNum() {
		
		for(int i = 1; i <= 10; i++)
			System.out.println(i);
	}
	
	static void printTable() {
		for(int i = 1; i <= 10; i++)
			System.out.println("2 * "+i+" = "+(2 * i));
	}
	
	static void infiniteLoop() {
		for(;;)
			System.out.println("Hello");
	}

	public static void main(String[] args) {
        //printNum();
		//printTable();
		infiniteLoop();
    }
}