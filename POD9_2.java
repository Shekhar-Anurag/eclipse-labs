import java.util.Scanner;

public class POD9_2 {

	static int maxLen = Integer.MIN_VALUE;
	static int k;

	static void checkStr(String str) {

		char[] chArr = str.toCharArray();
		boolean passed = true;
		for (int i = 0; i < chArr.length; i++) {
			char ch = chArr[i];
			int count = (int) str.chars().filter(c -> c == ch).count();

			if (count < k) {
				passed = false;
				break;
			}

		}
		if (passed == true) {
//			System.out.println(str);
			maxLen = (maxLen <= str.length()) ? str.length() : maxLen;
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inp = scan.nextLine().trim();
		k = scan.nextInt();
		scan.close();

		int winSize = inp.length();


		while (winSize > k) {
			for (int i = 0; i + winSize <= inp.length(); i++)
				checkStr(inp.substring(i, i + winSize));
			winSize--;
		}

		System.out.println(maxLen);

	}
}
