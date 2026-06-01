package multilevel_inheritance;



// IS a Relationship

// Single Inheritance ->

public class Father extends GrandFather{
	
	
	String bankAccount="BA-1112123123";
	
	double bankAccountMoney= 300000;
	
	
	String fatherPhone = "Iphone 17Pro Max";
	
	
	public void getFatherInfo() {
		
		
		
		System.out.println("Bank Account No - "+bankAccount);
		
		System.out.println("Bank Account Wallet - "+bankAccountMoney );
		
		System.out.println("Father Phone is "+fatherPhone);
		
	}

}
