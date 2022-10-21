import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		scan.close();
		
		String[] inputs = input.replaceAll("\\[", "").replaceAll("\\]", "").split(",");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			nums.add(i, Integer.parseInt(inputs[i]));
		
		
		int maxWidth =0;
		int width = 0;
		for(int i = 1; i<n-1;i++) {
			int prev = nums.get(i-1);
			int curr = nums.get(i);
			int next = nums.get(i+1);
			
			if(prev<curr);
		}

	}

}
