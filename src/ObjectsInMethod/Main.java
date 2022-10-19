package ObjectsInMethod;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Mercedes");
		Car car2 = new Car("Ferrari");
		Garage garage = new Garage();
		
		garage.park(car1);
		garage.park(car2);
		
	}

}
