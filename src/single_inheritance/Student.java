package single_inheritance;



// Person -> Student (Is A Relationship)

// Student is a Person
public class Student extends Person{

	
	String studentID;
	
	String grade;
	
	
	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name= "Mg Mg";
		student.age=20;
		student.hairColor="Black";
		student.nrcNo = "12/TAMANA(N)123456";
		student.studentID="6708457";
		student.grade="Second Year";
		
		student.getPersonInfo(); //From Person Class
		student.studentInfo(); // From Student Class (Own Class  Properties) 
		
		
		
		
		
	}
	
	
	public void studentInfo() {
		
		System.out.println("Student ID is "+studentID);
		System.out.println("Grade is "+grade);
	}
	
	
	

}
