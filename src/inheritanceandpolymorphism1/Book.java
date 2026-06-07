package inheritanceandpolymorphism1;

public class Book extends LibraryItem{
	
	
	String author;
	
	public Book(String title, String itemcode, String author) {
		
		super(title, itemcode);
		
		this.author = author;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("=====Book Information====");
		
		System.out.println("Title: "+title);
		
		System.out.println("Item Code:"+itemcode);
		
		System.out.println("Author:" +author);
	}
	
	

}
