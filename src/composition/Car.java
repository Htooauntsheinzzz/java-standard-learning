package composition;

public class Car {
	
	//Composition Lesson
	
	// Has A relationship
	
	Motor motor; // Class Field Obj
	
	
	
	public static void main(String[] args) {
	
		// Has A Relationship
		// Car has a motor -> principle 
		Motor m = new Motor(); 
		
		m.name = "JDM-Motor";
		m.hp =150;
		m.speed = 560.55;
		
		m.getInfo();
		
		
		
	}

}
