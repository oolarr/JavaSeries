package InterfaceDemo;

public class Goose implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("*The goose is hunting insects*");
		
	}

	@Override
	public void flee() {
		System.out.println("*The goose is fleeing*");
		
	}

}
