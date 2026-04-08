package operators; 

public class RelationalOperators {

	public static void main(String[] args) {
	 
		int numberOne = 60;
		
		int numberTwo  = 60 ;

		
		// ==  
		// 					10 == 10 -> true 
		// 	`				10 == 5 -> false 
		boolean isSame = numberOne == numberTwo;
		
		System.out.println(isSame);
		
		
		// != 
		// 					10    not equal 5  -> true;
		boolean result = numberOne != numberTwo;
		
		System.out.println(result);
		
		
		// >
		// 					10 		> 20 -> false
		
		// 					10 		> 10 -> false
		boolean resultOne = numberOne >= numberTwo;
		
		System.out.println(resultOne);
		
		// 					40 		< 50
		
		boolean resultTwo = numberOne <= numberTwo;
		
		System.out.println(resultTwo);

	}

}
