package Inheritance;

public class Car extends Vehicle{
	int wheels = 4;
	int doors = 4;
	
	@Override
	void go() {
		System.out.println("The car is moving");
	}

}
