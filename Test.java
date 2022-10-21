
public class Test {
	public static int x= 5;
	
	public static void update() {
		System.out.println("x in update "+ x);
	}
	
	public static void main(String... strings ) {
		x=10;
		System.out.println("x in main "+ x);
		update();
	}
}
