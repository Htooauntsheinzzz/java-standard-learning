package methodOverloading;

public class Person {
	
	
	public int age;
	
	
	public void details(String name,String work) {
		
		System.out.println(name + " is age "+age + " and also working in "+work+ " fields.");
	}
	
	
	
	public void family(String father , String mother) {
		
		System.out.println("Father name is "+father);
		
		System.out.println("Mother name is "+mother);
	}
	
	
	public String status(boolean isSingle) {
		
		if (isSingle) {
			
			return "He is single.";
			
		}else {
			
			return "He is married.";
			
		}
	}

}
