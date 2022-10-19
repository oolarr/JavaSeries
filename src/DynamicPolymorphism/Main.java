package DynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What type of animal would you like? ");
		System.out.println("(1=dog) or (2=cat)");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speak();			
		}
		else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("This choice is invalid");
			animal.speak();
		}
	

	}

}
