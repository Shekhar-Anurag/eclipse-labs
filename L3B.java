import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class L3B {
	public static HashMap<Integer, String> player_name = new HashMap<Integer, String>();
	public static ArrayList<Integer> scores = new ArrayList<Integer>();

	public static void main(String... strings) {

		Scanner s = new Scanner(System.in);

		int p_count = s.nextInt();
		int rank = s.nextInt();

		ArrayList<Integer> stats = new ArrayList<Integer>();
		int j = 1;
		for (int i = 0; i < 2 * p_count + 1; i++)
			stats.add(i, 0);
		for (int i = 1; i < 2 * p_count + 1; i = i + 2) {
			stats.add(i, j++);
			stats.remove(stats.size() - 1);
		}

		s.nextLine();
		for (int i = 1; i <= p_count; i++) {
			String name = s.nextLine();
			int fouls = Integer.parseInt(s.nextLine());
			int goals = Integer.parseInt(s.nextLine());
			int baskets = Integer.parseInt(s.nextLine());
			int minutes = Integer.parseInt(s.nextLine());

			player_name.put(i, name);

			double score = (double) (fouls + (2 * goals) + (3 * baskets)) * 1000 / minutes;
			int r_score = (int) Math.round(score);
			stats.add(2 * i, r_score);
			stats.remove(2 * i + 1);
			scores.add(r_score);

//			System.out.println("Player Name : " + name + " Score : " + r_score);

		}
		System.out.println("Player HashMap " + player_name);
		System.out.println("Player id and their score " + stats.toString());
		System.out.println("Scores before sorting : " + scores.toString());
		Collections.sort(scores);
		System.out.println("Scores after sorting : " + scores.toString());
		Collections.reverse(scores);
		System.out.println("Scores after reversing : " + scores.toString());
		int output_score = scores.get(rank - 1);
		System.out.println(output_score);
		int p_index = stats.get(stats.indexOf(output_score) - 1);
		System.out.println("Player index " + p_index);
		String output_name = player_name.get(p_index);

		System.out.println(output_name + " " + output_score);

		s.close();

	}

}
