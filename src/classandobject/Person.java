package classandobject;

public class Person {
	
	
	String name;
	
	int age;
	
	String gender;
	
	
	
	public void getInfo() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
	}
	
	public void getEat(String food) {
		
		System.out.println(name + " eat " + food);
	}
	
	public void getDrink(String drink) {
		
		System.out.println(name + " drink "+drink);
		
	}
	
	public void getWork(String work, String address) {
		
		System.out.println(name + " work is "+work);
		
		System.out.println("Address is " + address);
		
	}
	
	

}
