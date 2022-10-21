import java.util.Scanner;

public class Steep {
	


	public static void findSteepest(int[] arr) {
		int res = 0;
		
		for(int i =1;i<arr.length-1;i++) {
			int prev = arr[i-1];
			int curr = arr[i];
			int next = arr[i+1];
			
			int lMax = Math.max(Math.abs(prev-curr),Math.abs(curr-next));
			System.out.println(lMax);
			if(res>lMax)
				res = lMax;
			
		}
	
			System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		sc.nextLine();
		String[] s = sc.nextLine().split(",");
		for(int i=0; i<arrSize; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		findSteepest(arr);
		
		sc.close();
	}

}
