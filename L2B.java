import java.util.Scanner;

public class L2B {

	public static int[] gameState = new int[101];
	public static int a = 1;
	public static int b = 1;

	public static int updatePosition(int currPos, int x) {
		System.out.println("Dice rolled : " + x);
		int nextPos = currPos + x;
		System.out.println("GameState  : " + nextPos + " has " + gameState[nextPos]);
		if (gameState[nextPos] == 0) {
			System.out.println("in if " + nextPos);
			return nextPos;
		} else {
			System.out.println("in else " + gameState[nextPos]);
			return updatePosition(gameState[nextPos], 0);
		}

	}

	public static void main(String[] args) {

		//int[] gameState = new int[101];
		for (int i = 0; i < 101; i++)
			gameState[i] = 0;

		Scanner scan = new Scanner(System.in);
		int elem = scan.nextInt();
		for (int i = 0; i < elem; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			gameState[x] = y;
		}

		for (int i = 0; i < 101; i++)
			System.out.println("Board position " + i + " has value : " + gameState[i]);

		int moves = scan.nextInt();

		for (int i = 1; i <= moves; i++) {
			System.out.println("***************************************");
			if (i % 2 != 0) {
				System.out.println("Check1 27 "+gameState[27]);
				System.out.println("A old position : " + a);
				a = updatePosition(a, scan.nextInt());
				System.out.println("A new position : " + a);
				System.out.println("Check2 27 "+gameState[27]);
			} else {
				System.out.println("B old position : " + b);
				b = updatePosition(b, scan.nextInt());
				System.out.println("B new position : " + b);
			}
		}

		System.out.println(a + "****" + b);
		
		
		scan.close();

	}

}
