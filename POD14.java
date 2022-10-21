import java.util.*;
public class POD14 {

	public static int Minstep(int arr[],int n) {
		
		Integer [] dp= new Integer[n+1];
		
		
		dp[n]=0;
		
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>0) {
				
				int min=Integer.MAX_VALUE;
				for(int j=1;j<=arr[i] && i+j < dp.length;j++) {
					
					if(dp[i+j]!=null) {
						
						min=Math.min(min, dp[i+j]);
					}
					
				}
				
				if(min!=Integer.MAX_VALUE) {
					dp[i]=min+1;
					
				}
				
			}
			
		}
		
		
		return dp[0];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n=Integer.parseInt(sc.nextLine());
		
		String [] s=sc.nextLine().split(" ");
		
		
		int [] arr= new int[s.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(s[i]);
		}
		
		System.out.print(Minstep(arr,n-1));
		
		
	}

}
