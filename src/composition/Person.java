package composition;

public class Person {
	
	
	String name;
	int age;
	String fatherName;
	String motherName;
	
	
	
	public void getPersonInfo() {
		
		System.out.println("Hello it is "+name);
		System.out.println("Age is  "+age);
	}
	
	
	public String getFamilyInfo() {
		
		return name+" father name is "+fatherName+ " and Mother name is "+motherName;
	}

}
