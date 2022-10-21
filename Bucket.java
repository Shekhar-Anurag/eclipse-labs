import java.util.Scanner;

public class Bucket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();
		
		long maxCapacity = n*(n+1)/2;
		long count = 0,n1=n,capcity=k;
		if(k>maxCapacity)
			System.out.println("-1");
		else if(k==maxCapacity) 
			System.out.println(n);
		else if(k==0)
			System.out.println("0");
		else {
			
			do
			{
				long t = capcity - n1;
				count++;
				if(t<=0)
					break;
				else {
					n1--;
					capcity=t;
				}
			}while(n1>0);
				
			System.out.println(count);
		}
		scan.close();
	}

}
