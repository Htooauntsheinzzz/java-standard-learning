package operators;

public class UnaryOperatorsTwo {

	public static void main(String[] args) {
		
		
	
		int a = 4;
		
//		int b = a--; // Decrease Postfixed
		
		
		int b = --a; //Decrease Prefixed 
		
// b = --a (4) -> a= 3 , b = 3 , a = 3 
		
		int c = 5;
		
		int d = c++; // Increase PostFixed
		// d = c (5) -> d  = 5 ->  AFTER FINISHED THIS CODE LINE   C+1 = 6 
		
//		int d = ++c; // Incrase Prefixed;
		
		// d =  c(5) -> Before Start the code line  C+1 = 6  -> d = C+1 => d = 6  
 		
		
		
		System.out.println(b);  
		System.out.println(a);   
		
		
		System.out.println(c);
		System.out.println(d);
		 
		

	}

}
