package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int numberOne = 60;
		
		int numberTwo = 50;
		
		
		int numberThree = 70;
		
		int numberFour  = 70;
		
								// Process one 				Process Two
		//						40 			50 (false) 		40  < 70 (true) 	and -> all process must be true -> true 
		boolean logicalAnd =  numberOne == numberTwo && numberThree  < numberFour;
		
				// 				60  == 50 (false) 		40 < 70 (true)
		
		// 							one process is true -> true result 
		boolean logicalOr =  numberOne == numberTwo ||  numberThree  < numberFour;
		
		System.out.println(logicalAnd);
		System.out.println(logicalOr);

	}

}
