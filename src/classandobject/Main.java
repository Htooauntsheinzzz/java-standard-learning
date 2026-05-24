package classandobject;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Person personOne = new Person();
		
		
		personOne.name="Su Su";
		personOne.age = 22;
		personOne.gender ="Female";
		
		personOne.getInfo();
		personOne.getEat("Rice and Curry");
		personOne.getDrink("Water & Fruits Juice");
		personOne.getWork("Computer Sciences", "Thailand");
		
		
		
		System.out.println("--------------------");
		Person personTwo = new Person();
		
		personTwo.name="Tun Tun";
		personTwo.age = 34;
		personTwo.gender="Male";
		
		
		personTwo.getInfo();
		personTwo.getEat("Bread & Meat");
		personTwo.getDrink("Water");
		personTwo.getWork("Senior Developer", "New York");
		
		
		
	}

}
