package controlflow;

public class ProgramFive {

	public static void main(String[] args) {
	
		int i = 1; 
		
		while (i  < 5 ) {
			
			System.out.println(i + 7 + " Calculation with i ="+ i);
			
			i++; 
		}
		
		
		/**
		 * 
		 *   start 		end 					output 		rate
		 *    1 		1 < 5 = true			1 + 7 = 8 		2
		 *    2 		2 < 5 = true 			2 + 7 = 9 		3
		 *    3 		3 < 5 = true 			3 + 7 = 10 		4
		 *    4 		4 < 5 = true 			4 + 7 = 11 		5 
		 *    5 		5 < 5 = false  -> stop the program 
		 */
		
		

	}

}
