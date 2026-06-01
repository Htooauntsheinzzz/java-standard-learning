package single_inheritance;


// Single Inheritance 
//keyword -> extend 
// Dog is a Animal (Is A Relationship)
public class Dog extends Animal{

	
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.name ="Aung Net";
		d.age = 4;
		d.breed = "Husky";
		
		
		d.showInfo();
		
		
		
	}
}
