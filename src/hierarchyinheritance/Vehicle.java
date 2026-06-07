package hierarchyinheritance;

public class Vehicle {
	
	String brand;
	
	String model;
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String brand , String model) {
		
		this.brand = brand;
		
		this.model = model;
		
	}
	
	public void getVehicleInfo() {
		
		System.out.println("Brand :"+brand);
		
		System.out.println("Model :"+model);
	}
	

}
