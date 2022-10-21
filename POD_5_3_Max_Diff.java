import java.util.Arrays;
import java.util.Scanner;

public class POD_5_3_Max_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int[] nums = new int[n];
		String[] inp = scan.nextLine().split(",") ;
		for(int i = 0; i<n;i++)
			nums[i]= Integer.parseInt(inp[i]);
//		System.out.println(Arrays.toString(nums));
		int maxDiff = Integer.MIN_VALUE;
		
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1; j<n;j++)
				if(maxDiff<nums[j]-nums[i])
					maxDiff = nums[j]-nums[i];
		}
		if(maxDiff>0)
			System.out.println(maxDiff);
		else
			System.out.println("0");
	}

}
