import java.util.Scanner;

public class POD10_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		if (s.length() == 1) {
			System.out.println(1);
			System.exit(0);
		}
		int a = 0;
		int minPLen = 0;
		while (!s.equals("")) {
			char ch = s.charAt(0);
			int count = (int) s.chars().filter(c -> c == ch).count();
			s = s.replaceAll(Character.toString(ch), "");
			minPLen = minPLen + count;
			if (count % 2 != 0) {
				minPLen--;
				a++;
			}

		}

		if (a == 0)
			System.out.println(minPLen);
		else if (a > 0) {
			System.out.println(minPLen + 1);

			scan.close();
		}

	}
}
