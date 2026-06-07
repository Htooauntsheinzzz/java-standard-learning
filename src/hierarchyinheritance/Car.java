package hierarchyinheritance;

public class Car extends Vehicle{
	
	int noOfDoors;
	
	String petrol;
	
	public Car(String brand, String model, int numberOfDoors,String petrol) {
		
		this.brand = brand;
		this.model = model;
		this.noOfDoors = numberOfDoors;
		this.petrol = petrol;
	}
	
	public void getCarInfo() {
		
		getVehicleInfo();
		
		System.out.println("Number of Doors :"+noOfDoors);
		
		System.out.println("Petrol :"+petrol);
	}

}
