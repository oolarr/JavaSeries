import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Jollof Rice");
		food.add("Jerk Chicken");
		food.add("Plantain");
		
		food.set(1, "Suya");
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

	}

}
