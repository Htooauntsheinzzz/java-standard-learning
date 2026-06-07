package hierarchyinheritance;

public class Truck extends Vehicle{
	
	
	double loadCapacity;
	
	public Truck(String brand , String model,double loadCapacity) {
		
		this.brand = brand;
		
		this.model = model;
		
		this.loadCapacity = loadCapacity;
		
		
	}
	
	public void getTruckInfo() {
		
		getVehicleInfo();
		
		System.out.println("Load Capacity :"+loadCapacity);
		
		
	}

}
