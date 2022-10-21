import java.util.*;
public class POD15 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int MaxDiff=0;
		int n= sc.nextInt();	
		sc.nextLine();
		  
		String[] arr= sc.nextLine().split(",");
		
		int [] numbers= new int[n];
		
		
		for(int i=0;i<n;i++) {
			numbers[i]=Integer.parseInt(arr[i]);
		}
			
		
		
		
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(numbers[j]>numbers[i]) {
					int temp=numbers[j]-numbers[i];
					if(temp>MaxDiff) {
						MaxDiff=numbers[j]-numbers[i];
					}
						
					
				}
			}
		}
		
		
		System.out.print(MaxDiff);
 
	}

}
