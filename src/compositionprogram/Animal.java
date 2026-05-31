package compositionprogram;

import java.util.Scanner;

public class Animal {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dog Name");
		String dogName = sc.nextLine();
		
		System.out.println("Enter Dog Age");
		
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Dog Breed ");
		String breed = sc.nextLine();
		
		
		if(age <=10) {
			
			System.out.println("Enter food One Details");
			String foodOne = sc.nextLine();
			
			
			System.out.println("Enter Food Two Details");
			String foodTwo = sc.nextLine();
			
			Dog dog = new Dog(dogName,age,breed);
			
			dog.getDogInfo();
			dog.getFoodDetails(foodOne, foodTwo);
		}else {
			
			System.err.println("You Cannot failed this form.");
			
		}
		
		
		sc.close();
		
	}

}
