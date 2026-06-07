package inheritanceandpolymorphism1;

public class DVD extends LibraryItem{
	
	
	double duration;

	public DVD(String title, String itemcode,double duration) {
		super(title, itemcode);
		this.duration = duration;
		
	}
	
	
	public void showInfo() {
		
		
		System.out.println("=====DVD Information====");
		
		System.out.println("Title: "+title);
		
		System.out.println("Item Code:"+itemcode);
		
		System.out.println("Duration :"+duration + " Hours");
		
		
	}
	
	

}
