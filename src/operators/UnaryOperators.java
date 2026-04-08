package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		// Unary Operators
		int a = 2 ; // unary plus (+1)
		
		int b = -4 ; // Unary minus 
		
	
		boolean c = true;
		
		boolean d = !c ; // Not Complement  c =  true;  !c = false 
		
		System.out.println(a);
		
//		int numberOne = ++a  ;  // Unary Incresement  a++ -> a +1  // PreFix
		
		int numberOne = a++ ; // PostFixed +1  -> 2 +1 = 3
		
	
					
		// Increment + Decresement 
		// Two Type 
		/*
		 *  prefix  operand front 
		 *  postfix  operand back 
		 */
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	
		System.out.println("After Postfixed Number One Value is "+numberOne);
		System.out.println("PostFixed A value value is "+ a);
		
		
		
		
		
		

	
	}

}
