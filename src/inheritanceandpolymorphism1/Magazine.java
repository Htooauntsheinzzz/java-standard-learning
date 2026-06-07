package inheritanceandpolymorphism1;

public class Magazine extends LibraryItem{
	
	String publisherCode;
	
	

	public Magazine(String title, String itemcode,String publisherCode) {
		super(title, itemcode);
		
		this.publisherCode = publisherCode;
		
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("=====Magazine Information====");
		
		System.out.println("Title: "+title);
		
		System.out.println("Item Code:"+itemcode);
		
		System.out.println("Publisher Code:"+publisherCode);
		
		
	}
	
	

}
