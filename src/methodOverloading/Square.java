package methodOverloading;

public class Square {
	
	
	// method overloading  
	
	// method is same name but different parameters size  or name
	
	
	
	public void task() {
		
		System.out.println("I am without parameters");
	}
	
	public void task(int num) {
		
		System.out.println("I am contain one parameter "  + num);
		
	}
	
	
	public void task(int number , String name) {
		
		
		System.out.println("I am two parameters "+number + name);
		
	}

}
