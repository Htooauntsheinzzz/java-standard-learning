package compositionprogram;

public class Dog {
	
	
	String dogName;
	int age;
	String breed;
	
	
	
	public Dog() {
		
	}
	
	public Dog(String dogName, int age, String breed) {
		this.dogName = dogName;
		this.age = age;
		this.breed = breed;
	}
	
	
	public void getDogInfo() {
		System.out.println("Name is "+dogName);
		System.out.println(dogName +" age is "+age);
		System.out.println("Breed is "+breed);
		
		
	}
	
	
	public void getFoodDetails(String foodOne , String foodTwo) {
		
		System.out.println(dogName +" eat "+ foodOne +","+ foodTwo);
	}

}
