package array;


import java.util.Arrays;

public class SingleArray {
	
	public static void main(String[] args) {
		// Declare 3
		String [] names = new String [5];
		
		names[0] = "Mg Mg";
		names[1] = "Ko Ko";
		names[2] = "Nyi Nyi";
		names[3] = "Su Su";
		names[4] = "Ma Ma";
		
		
		System.out.println(names[2]); 

		// output all execute 
		System.out.println(Arrays.toString(names));
		
		
		/*
		 * Limitless Array declare
		 * 
		 */
		
		
		// Array Declare 1
		String [] people = new String [] {"Ko Ko" , "Aung Aung", "Soe Soe"};
		
		
		//Arrary Declare 2 
		
//									 0 		1 			2 				3
		String [] studentNames = {"Julian", "Novice", "Linkin Park", "Shroud"};
		
		// length = index + 1
		
		// index = length - 1 
		System.out.println("Student Names Length "+studentNames.length);
		
		
	}
	

	
	

}
