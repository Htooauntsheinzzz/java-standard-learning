package compositionprogram;

public class Address {
	
	
	String city;
	String country;
	String postalCode;
	String addressLineOne;
	String addressLineTwo;
	
	
	
	public Address (String city,String country,String postalCode,String addressLineOne,String addressLineTwo) {
		
		
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		
	}
	
	
	public String getAddressInfo() {
		
		return "City -"+city+"\n"
				+ "Country -"+country+"\n"
				+"Postal Code -"+postalCode+"\n"
				+"Address -"+addressLineOne+ " , "+  addressLineTwo;
	}
	
	

}
