package methods;


// Creating Methods


public class CustomCreatingMethod {
	
	
	/*
	 * 
	 * 1.method name
	 * 2.return type 
	 * 3.access modifier
	 * 4.parameter
	 */
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	
	public void task() {
		 System.out.println("Hello this is tasks");
	 }
	
		
	// use camel case for naming method
	public void calculationFood() {
		
	}
	
	// method contains parameter
	public void todo(String name) {
		System.out.println(name);
	}
	
	// return type is without void 
	public String callingName(String name) {
		
		
		return name;
	}
	
	public int calculate(int numberOne , int numberTwo) {
		
		int result = numberOne + numberTwo;
		
		return result;
	}
	
	

}
