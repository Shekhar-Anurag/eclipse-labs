import java.util.Scanner;

public class POD_5_2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] inputs = scan.nextLine().trim().split(",");
		int[] nums = new int[n];
		for(int i =0;i<n;i++)
			nums[i] = Integer.parseInt(inputs[i]) ;
		int reqNum = n-1;
		int minSteps = Integer.MAX_VALUE;
		
	}

}
