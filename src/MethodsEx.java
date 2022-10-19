
public class MethodsEx {

	public static void main(String[] args) {
		int x = 70;
		int y = 24;
		System.out.println(add(x,y));
		
		String name = "Ola";
		int age = 29;
		hello(name, age);
		
		}
	static int add(int x, int y) {
		return x+y;
	}

	static void hello(String name, int age) {
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");

	}

}
