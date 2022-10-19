import java.util.Scanner;

public class RowsAndColumns {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Please enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Please enterv number of columns: ");
		columns = scanner.nextInt();
		System.out.println("Please enter symbol: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
			scanner.close();
		}
		

	}

}
