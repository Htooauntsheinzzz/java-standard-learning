package array;

public class Main {
	// Array
	public static void main(String[] args) {
		
		int a = 1 ; // Variable Init
		
		
		// Array Initialize
	
 // Datatype Arrary Sign 	arrayname  new keyword		DataType		ArraryLength 
		int		 [] 		numbers =  new 				int 			[5]; // Index -> 5 - 1   = 4 
		
		
		// Data Input
		
		numbers[0] = 1; // index 0  // 1 length
 		numbers[1] = 2; // index 1  // 2 
		numbers[2] = 3; // index 2  // 3
		numbers[3] = 4; // index 3  // 4 
		numbers[4] = 5; // index 4  // 5 
//		numbers[5] = 6; // index out of bound error 
		
		
		// output -> arrayName [index]
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
}

}
