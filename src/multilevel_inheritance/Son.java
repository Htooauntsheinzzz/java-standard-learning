package multilevel_inheritance;



// Son -> Father -> GrandFather

// Multilevel Inheritance 
public class Son extends Father{

	public static void main(String[] args) {
	
		Son son = new Son();
		
		
		son.getGrandFatherInfo();
		
		son.getFatherInfo();
	}

}
