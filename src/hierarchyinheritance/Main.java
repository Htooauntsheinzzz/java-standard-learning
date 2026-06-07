package hierarchyinheritance;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car("BMW", "2019", 4, "98+");
		
		car.getCarInfo();
		
		
		Truck truck = new Truck("Hondai", "2018", 600);
		
		truck.getTruckInfo();
		
		
	}

}
