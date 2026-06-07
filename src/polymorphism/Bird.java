package polymorphism;

// Hierarchy Inheritance
public class Bird extends Animal{
	
	
	// Polymorph method
	
	public void fly() {
		
		System.out.println(name + "Can fly.");
	}
	
	public static void main(String[] args) {
		
		
		Bird b1 = new  Bird();
		
		b1.name="Nightingale";
		b1.eat();
		b1.sleep();
		b1.fly();
		
		
	}

}
