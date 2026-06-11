package enpcasulation1;

public class Dad {
	
	private String wallet; // Private Access Level
	
	String phone; // default Access Level
	
	protected String watch; // protected Access level
	
	public String cloth; // public access level 
	
	
	private void getWallet() { // Private Access Level Method
		System.out.println("Wallet is "+wallet);
	}
	
	// default access level method
	void getPhone() {
		System.out.println("Phone is "+phone);
		
	}
	
	// Protected Access Level Method
	protected void getWatch() {
		System.out.println("Watch is "+watch);
		
	}
	
	public void getCloth() {
		
		System.out.println("Cloth is "+cloth);
	}
	
	
	public static void main(String[] args) {
		Dad dad = new Dad();
		
		dad.wallet = "$1000";
		dad.phone = "Iphone 17 Pro Max";
		dad.watch = "Rolex";
		dad.cloth ="Uniqulo";
		
		
		dad.getWallet();
		dad.getPhone();
		dad.getWatch();
		dad.getCloth();
		
		
	}
	
	
	

}
