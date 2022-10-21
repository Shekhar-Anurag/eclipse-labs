import java.util.Scanner;

public class Ludo {

	public int[] state = new int[101];
	public static int a = 1;
	public static int b = 1;

	Ludo() {
		int[] gameState = new int[101];
		for (int i = 0; i < 101; i++)
			gameState[i] = 0;
	}

	public static int updatePosition(Ludo game, int currPos, int x) {
		int nextPos = currPos + x;
		if (game.state[nextPos] == 0)
			return nextPos;
		else
			return updatePosition(game, game.state[nextPos], 0);

	}

	public static void main(String[] args) {

		Ludo game = new Ludo();

		Scanner scan = new Scanner(System.in);
		int elem = scan.nextInt();
		for (int i = 0; i < elem; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			game.state[x] = y;
		}

//		for (int i = 0; i < 101; i++)
//			System.out.println("Board position " + i + " has value : " + game.state[i]);

		int moves = scan.nextInt();

		for (int i = 1; i <= moves; i++) 
			if (i % 2 != 0)
				a = updatePosition(game, a, scan.nextInt());
			else
				b = updatePosition(game, b, scan.nextInt());


		if(a>b)
			System.out.println("A "+a);
		else
			System.out.println("B "+b);

		scan.close();

	}

}
