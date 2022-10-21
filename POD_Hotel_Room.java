import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class POD_Hotel_Room {

	public static HashMap<Integer, Integer> rooms = new HashMap<Integer, Integer>();
	public static HashSet<Integer> available = new HashSet<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String result = "";
		String[] s = scan.nextLine().split(" ");
		int[] requests = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			requests[i] = Integer.parseInt(s[i]);

		}

		for (int i = 1; i <= n; i++)
			rooms.put(i, 0);

		for (int i = 0; i < requests.length; i++) {
			int r = requests[i];
			if (rooms.containsKey(r)) {
				if (rooms.get(r) == 0) {
					rooms.put(r, 1);
					result = result+r + " ";
				} else {
					r = r + 1;
					while (!(rooms.get(r) == 0)) {
						r++;
					}
					if (r <= n) {
						rooms.put(r, 1);
						result = result+r + " ";
					}
				}
			}
		}

		System.out.print(result.trim());
		scan.close();
	}

}
