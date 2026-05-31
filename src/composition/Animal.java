package composition;

public class Animal {
	
	public static void main(String[] args) {
		
		
		// Animal has a person 
		Person p = new Person();
		
		p.name = "Phyo Khant Kyaw";
		p.age = 19;
		p.fatherName="U Ba";
		p.motherName= "Daw Mya";
		
		
		p.getPersonInfo();
		String familyDetails = p.getFamilyInfo();// return type
		
		System.out.println(familyDetails);
		
		
		
		
	}

}
