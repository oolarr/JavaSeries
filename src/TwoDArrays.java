
public class TwoDArrays {

	public static void main(String[] args) {
		String[][] players = {
				{"Pliskova", "Gauff"},
				{"Sabalenka", "Swiatek"}
		};
		for(int i=0; i<players.length; i++) {
			System.out.println();
			for(int j=0; j<players[i].length; j++) {
				System.out.print(players[i][j]+" ");
			}
		}

	}

}
