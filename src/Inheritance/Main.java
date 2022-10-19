package Inheritance;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bike = new Bicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		
		Hero hero1 = new Hero("Jean", 28, "Telepath");
		System.out.println(hero1);
		

	}

}
