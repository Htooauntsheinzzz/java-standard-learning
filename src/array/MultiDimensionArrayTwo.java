package array; 

public class MultiDimensionArrayTwo {
	
	// three dimension array
	
	public static void main(String[] args) {
	
		
		String [][][] cars = { 
				{ 
					{ 
						"BMW" , "Mercedes", "Toyota"
					}, 
					
					{
						"Mini Cooper","Telsa","Neta"
					}, 
					{
						"BYD", "Honda", "Mitsubishi"
					}  
					 
				}, 
				{
					{
						"1" , "2" , "3"
					},
					{
						"4", "5" , "6"
					},
					{
						"7", "8" ,"9"
					}
				} 
		};
		
		
		System.out.println(cars [0] [0] [1]);
		
		
		System.out.println(cars [1][2][1]);
		
		System.out.println(cars.length);
		
	}

}
