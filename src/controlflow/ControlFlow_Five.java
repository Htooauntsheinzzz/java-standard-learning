package controlflow;

public class ControlFlow_Five {
	
	
// If Else IF Else -> Selection Statement
	
/**
 * 
 *   if (condition ){
 *   		continue output or statement
 *   }else if (condition) {
 *   		continue output or statement
 *   }else{
 *   		continue output or statement
 *   }
 */
	
	
	public static void main(String[] args) {
		
		
		int number = 10;
		// if number (10)  equal 11 -> false 
		if (number == 11) {
			System.out.println("This is no eleven");
				// 10   == 10 -> true
		}else if (number == 10) {
			
			System.out.println("This is no 10");
			
		}else {
			System.out.println("I dont know you number");
		}
		
		
		String username = "phyokhantkyaw";
		String password = "phyo123";
		
		
		if(username.equals("phyokhantkyaw") && password.equals("phyo123")) {
			
			
			System.out.println("Login Successful.");
			
			
		}else if (username.equals("phyokhantkyaw") || password.equals("phyo123")) {
			
			System.out.println("Your username or password is wrong.");
			
		}else {
			System.out.println("Login Failed.");
		}
		
		

	}

}
