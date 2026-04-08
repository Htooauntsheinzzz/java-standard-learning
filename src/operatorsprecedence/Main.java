package operatorsprecedence;

public class Main {

	public static void main(String[] args) {
			
		
	// operators precedence
		
		int a = 1+2; 
		
		int b = 2 * ++a + 1; // Operators Precedence 
		/*
		 *  step 1 -> ++a 
		 *  step 2 -> 2 * ++a value
		 *  step 3 -> 2 * ++a value + 1 
		 */
		
		
		int numberOne = 2 *  (3 + 3 );  // when use () -> do this operation first
		
	
		int numbertwo = 2 * (3 * 4) + 5 - 7 / 2; 
		
		/*
		 * step 1 -> (3 * 4 )
		 * step 2 -> 2 * (3 * 4 )
		 * step 3 -> 7 /2 -> 3 
		 * step 4 -> 2 * (3 * 4 ) + 5 
		 * step 5 ->  2 * (3 * 4 ) + 5  - 3 from (7/2)
		 */
		
		
		
		System.out.println(a);

		System.out.println(b);
		
		System.out.println(numberOne);
		
		System.out.println(numbertwo);
		
	}

}
