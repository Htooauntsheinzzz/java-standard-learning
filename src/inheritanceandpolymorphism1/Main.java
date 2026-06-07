package inheritanceandpolymorphism1;

public class Main {
	
	
	public static void main(String[] args) {
		LibraryItem [] items = new LibraryItem[3];
		
		items[0] = new Book("Java Developer For Beginner", "B-001", "James Gosling");
		
		items[1] = new Magazine("Techology in Nowadays", "M-001", "RangsitUniversity");
		
		items[2] = new DVD("Spring Boot for Zero to Advanced", "D-001", 14);
		
		for (LibraryItem item : items) {
			
			item.showInfo();
			
		}
  		
		
	}

}
