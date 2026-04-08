package operators;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
	
		int StudentOneAge = 23;
		
		int StudentTwoAge = 26;
		
		// ?:
		
		// process ? result One : result two
		
		// process true -> resultone 
		
		// process false -> result two
		
		// 					23 		> 20 true 				result one 
		String message = StudentOneAge > StudentTwoAge ? "It is true" : "It is false";
		
		System.out.println(message);
		
	}

}
