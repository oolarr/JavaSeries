package InterfaceDemo;

public class Main {

	public static void main(String[] args) {
		Impala impala = new Impala();
		Cheetah cheetah = new Cheetah();
		Goose goose = new Goose();
		
		goose.flee();
		goose.hunt();
		
		impala.flee();
		cheetah.hunt();

	}

}
