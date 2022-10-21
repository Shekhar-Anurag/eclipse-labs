import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prize {
	/*
	 * 1. Boost up : you can boost up if your money>= prize. If you boost up, you
	 * gain 1 score but you lose money by prize value. 2. Boost down : you can boost
	 * down if your score>0. If you boost down, you lose score by 1 but you gain
	 * money by prize value.
	 */
	static int score = 0;
	static int money = 0;

	static void boostUp(int prize) {
		score++;
		money = money - prize;
//		System.out.println("Up : Updated Score : "+score+" Updated Money : "+money);
	}

	static void boostDown(int prize) {
		score--;
		money = money + prize;
//		System.out.println("Down : Updated Score : "+score+" Updated Money : "+money);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int prizeCount = scan.nextInt();
		money = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		scan.close();
		
		String[] inputs = input.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
		ArrayList<Integer> prizes = new ArrayList<Integer>();
		for (int i = 0; i < prizeCount; i++)
			prizes.add(i, Integer.parseInt(inputs[i]));

		Collections.sort(prizes);


		while (!prizes.isEmpty()) {
			int prize = prizes.get(0);
//			System.out.println(prize+"...."+money+"....."+score);
			if (money >= prize ) {
				boostUp(prize);
				prizes.remove(0);
			} else if (money < prize && ((score - 1) >= 0)) {
				prize = prizes.get(prizes.size() - 1);
				boostDown(prize);
				prizes.remove(prizes.size() - 1);
			} else
				break;
		}
		System.out.println(score);
	}

}
