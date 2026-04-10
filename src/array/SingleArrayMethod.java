package array;

import java.util.Arrays;

public class SingleArrayMethod {
	
	public static void main(String[] args) {
		
		
	String [] cars = {"BMW", "Land Curiser","Pajaro","Swift","Mitsubishi"};
	
	// check data from array
	
	boolean isContain = Arrays.asList(cars).contains("Neta");
	
	System.out.println(isContain);
	
	
	
	int [] numbers = {10,20,30,40,50};
	
	int [] copyArray = new int [5];
	
	
	// 				original orig			copy      copy			original
	//						 start index    name	start index		length
	System.arraycopy(numbers, 0, 			copyArray, 0, 			4);
	
	System.out.println(Arrays.toString(copyArray));
	
	
	String [] oriArray = {"One" , "Two", "Three", "Four", "Five" , "Six","Seven","Eight"};
													//index    // length
	String [] desArray = Arrays.copyOfRange(oriArray, 2,  		6);
	
	System.out.println(Arrays.toString(desArray));
	

	
	
	}

}
