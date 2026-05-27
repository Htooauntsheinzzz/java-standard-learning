package constructoroverloading;

public class Square {
	
	
	public Square() {
		System.out.println("Hello I am Square Constructor without any parameters or default constructor of Square.");
	}
	
	public Square(int age) {// overloading
		System.out.println("Hello I am Square Constructor with one parameters. " + age);
	}
	
	
	public Square(int age , String name) {// parameter size 
		System.out.println("Age is "+age +", "+"Name is "+name);
	}
	
	
	public Square(String name,int age) {//  procedure
		System.out.println("Name is "+name + ", "+"Age is "+age);
	}

}
