import java.util.Scanner;

public class POD10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int limit = n/2;
		scan.nextLine();
		String s = scan.nextLine().trim().replaceAll(" ","");
		char result = 'x';
		for (int i =0; i<s.length();i++) {
			char ch = s.charAt(i);
			int count = (int) s.chars().filter(c -> c == ch).count();
			if(count>limit) {
				result = ch;
				break;
			}
		}
		System.out.println(result);
		scan.close();
	}

}
