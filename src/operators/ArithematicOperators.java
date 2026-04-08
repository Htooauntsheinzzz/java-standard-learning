package operators;
/*
 * MultiComments Remainder
 * Phyo Khant Kyaw 
 * TODO this class;
 */
public class ArithematicOperators {
// ARITHEMATIC OPERATORS 
	public static void main(String[] args) {

// Single Comments Notice 
	int numberOne = 100 ; 
		
	int numberTwo = 200 ;
		
// 		Additional ( + ) 
		int numberThree = numberOne + numberTwo; 
		System.out.println("Additional value  = "+numberThree);
		

// *****************************************************************	
		
//SUBTRACTION OPERATORS		
		
		double balanceOne = 1500;
		
		double balanceTwo = 500;
		
		
		double withdraw = balanceOne - balanceTwo;
		
		System.out.println("Subtraction Value  = "+withdraw);

// *****************************************************************	
		
// MULTIPLY OPERATORS
		
		short ageOne = 30;
		
		short ageTwo = 40;
		
		// 				30 * 	40 
		int  total = ageOne * ageTwo; // short multiply value is greater than short so change to int for total.
		
		System.out.println("Multiply value = " + total);
// *****************************************************************	
		
// Division Operators
		
		
		int firstKilo  = 1300;
		
		int secondKilo= 40;
		
		
		int divResult = firstKilo / secondKilo;
		
		System.out.println("Division value = "+divResult);
		// *****************************************************************	
		
// Remainder Operators
		
		int firstNumber = 1257;
		
		int secondNumber = 23;
		
		int remainderResult = firstNumber % secondNumber;
		
		System.out.println("Remainder value = "+ remainderResult);
		
		
	} 

}
