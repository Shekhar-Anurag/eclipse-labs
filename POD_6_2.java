import java.util.ArrayList;
import java.util.Scanner;

public class POD_6_2 {
	
	static ArrayList<Integer> que1;
	static ArrayList<Integer> que2;
	static ArrayList<Integer> knownCount;
	static int num;
	static int iterations;
	
	public static boolean countCheck() {
		
		for(int i = 0; i<num;i++) {
			
			for(int j = 0; j<que1.size(); j++) {
//				if()
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		String inp1[] = scan.nextLine().trim().split(",");
		String inp2[] = scan.nextLine().trim().split(",");
		scan.close();
		que1 = new ArrayList<Integer>();
		que2 = new ArrayList<Integer>();
		for(String s : inp1)
			que1.add(Integer.parseInt(s));
		for(String s : inp2)
			que2.add(Integer.parseInt(s));
	}

}
