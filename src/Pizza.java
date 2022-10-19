
public class Pizza {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("Stuffed Crust", "Mozarella", "Tomato", "Suya");
		System.out.println("Here are the ingredients for your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.topping);
		
	
		pizza.displayIngredients();

	}
	
	
	String bread;
	String cheese;
	String sauce;
	String topping;
	
	Pizza(){
		
	}
	
	Pizza(String bread){
		this.bread = bread;
	}
	Pizza (String bread, String cheese){
		this.bread = bread;
		this.cheese = cheese;
	}
	Pizza (String bread, String cheese, String sauce){
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
	}
	Pizza (String bread, String cheese, String sauce, String topping){
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
		this.topping = topping;
	}
	public String toString() {
		return bread + " " + cheese + " " + sauce + " " +topping;
	}
	
	void displayIngredients() {
		System.out.println(bread+ " "+cheese+" "+sauce+" "+topping);
	}



}
