import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class POD_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int k = Integer.parseInt(scan.nextLine().trim());
		String[] inputs = scan.nextLine().trim().split(",");
		scan.close();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> numsCopy = new ArrayList<Integer>();
		for(String s : inputs) {
			nums.add(Integer.parseInt(s));
			numsCopy.add(Integer.parseInt(s));
		}
		
		Collections.sort(numsCopy);
		Collections.reverse(numsCopy);
		
		System.out.println(nums.indexOf(numsCopy.get(k-1)));
		
	}

}
