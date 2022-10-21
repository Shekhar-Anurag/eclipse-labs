import java.util.Scanner;

public class SubStr {

//	static boolean 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String mainStr = scan.nextLine();
		String subStr = scan.nextLine();
		scan.close();

		int mLen = mainStr.length();
		int sLen = subStr.length();

		if (mLen < sLen)
			System.out.println("");
		else if (mLen == sLen && mainStr.equals(subStr))
			System.out.println(mainStr);
		else if (mLen == sLen && !(mainStr.equals(subStr)))
			System.out.println("");
		else if (mLen > sLen) {
			boolean found = false;
			String output = "";
			String regex = "[^" + subStr + "]";
			int limit = sLen;
			while (!found && limit<mLen) {
				for (int j = 0; j < mLen - limit + 1; j++) {
					String s = mainStr.substring(j, j + limit);
					String sq = s.replaceAll(regex, "");
					if (sq.length() >= sLen) {
						found = true;
						output = s;
						break;
					}
					
				}
				limit++;
			}
			System.out.println(output);
		}
	}

}
