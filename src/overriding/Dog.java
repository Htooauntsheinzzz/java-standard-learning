package overriding;

public class Dog extends  Animal{
	
	
	@Override
	public void fly() {
		
		System.out.println(name + " Cannot Fly."); // Updating from animal class 's method
	}

	
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.name ="Aung Net";
		d1.fly();
	}
	

}
