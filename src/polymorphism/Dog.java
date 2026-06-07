package polymorphism;

public class Dog extends Animal{
	
	// polymorph method
	public void bark() {
		System.out.println(name + "can bark Woke Woke." );
	}
	
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.name = "Aung Net";
		d1.eat();
		d1.sleep();
		d1.bark();
	
	}

}
