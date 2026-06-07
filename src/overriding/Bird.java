package overriding;

public class Bird extends Animal{
	
	@Override
	public void fly() {
		super.fly();
		System.out.println(name + " flying in the sky.");
	}
	
	public static void main(String[] args) {
			Bird b1 = new Bird();
			
			b1.name ="Kel";
			b1.fly();
	}

}
