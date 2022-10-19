import java.util.ArrayList;

public class TwoDArrayListEX {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groceryList= new ArrayList();

		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Flour");
		bakeryList.add("Sugar");
		bakeryList.add("butter");
		
		ArrayList<String> vegList = new ArrayList<String>();
		vegList.add("Potatoes");
		vegList.add("Peppers");
		vegList.add("Spinach");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("Juice");
		drinksList.add("Tea");
		
		groceryList.add(bakeryList);
		groceryList.add(vegList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0).get(1));

	}

}
