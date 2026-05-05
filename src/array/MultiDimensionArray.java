package array;

public class MultiDimensionArray {

	
	// Two Dimension Array  
	public static void main(String[] args) {
		
		
		
		String [][] students = { 
				{
					// 0         1 			2
					"Mg Mg",  "Aung Aung" , "Ko Ko"
				}, // 0 
				{
					"Su Su", "Khin Khin" , "Moe Moe"
				} // 1 
				
		};
		
		
		int [] [] numbers = {
				{
					1,  2,  3,  4,  5
				}, // 0 
				{
			//		0  1    2   3
					6,  7,  8,  9,  10
				},// 1
				{
					11, 12, 13, 14,  15
				}// 2
				
		};
		
		
		
		
		
		System.out.println(students[1][1]);
		
		System.out.println(numbers[1][3]);
		
		
	 
		
		
	}

}
