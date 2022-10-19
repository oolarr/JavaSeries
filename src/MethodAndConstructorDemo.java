
public class MethodAndConstructorDemo {

	public static void main(String[] args) {
		Human human1 = new Human("Femi", 24, 75.5);
		Human human2 = new Human("Teju", 26, 76.5);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human2.play();
		
//		System.out.println(human2.getName);

	}

}
