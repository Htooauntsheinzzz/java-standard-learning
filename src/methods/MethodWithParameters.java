package methods;

public class MethodWithParameters {
	
	
	public static void main(String[] args) {
		
		
		MethodWithParameters object = new MethodWithParameters();
		
		object.add(10, 20);
		System.out.println(object.subtract(10, 5));
		System.out.println(object.multiply(9, 20));
		System.out.println(object.divided(10, 5));

		
	}
	
	
	
	// two parameter void method
	public void add(double numberOne , double numberTwo ) {
		
		
		double result = numberOne + numberTwo;
		
		System.out.println("This is add  =" +result);
				
		
	}
	
	
	public double subtract(double numberOne , double numberTwo) {
		
		double result = numberOne - numberTwo;
		
		return result;
		
		
	}
	
	public double multiply(double numberOne , double numberTwo) {
		
		double result =numberOne * numberTwo;
		
		return result;
		
	
		
	}
	
	public String divided(double numberOne , double numberTwo) {
		
		double result = numberOne/numberTwo;
		
		return "This is divided value = "+result;
	}

}
