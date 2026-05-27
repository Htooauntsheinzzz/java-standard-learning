package constructoroverloading;

public class ProgramOne {
	
	
	public static void main(String[] args) {
		
		Animal animalOne =new Animal("Aung Net","Mae Lone","Mi Nyo");// invoke
		
		animalOne.age=12;
		animalOne.species= "Dog";
		animalOne.food = "Fish and Bones";
		
		animalOne.getDetails();
		
		
	}

}
