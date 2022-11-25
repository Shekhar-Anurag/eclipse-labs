import java.util.ArrayList;
import java.util.Scanner;

public class POD7_1 {
	
	static ArrayList<Integer> que1;
	static ArrayList<Integer> que2;
	static int iterations;
	public static void popInsert(int queID1,int queID2) {
		iterations++;
		if(queID1<queID2) 
			que2.add(que1.remove(0));
		else
			que1.add(que2.remove(0));
			
	}
	
	public static int totalSum(ArrayList<Integer> al) {
		
		return al.stream().mapToInt(Integer::intValue).sum();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inp1[] = scan.nextLine().trim().split(" ");
		String inp2[] = scan.nextLine().trim().split(" ");
		scan.close();
		que1 = new ArrayList<Integer>();
		que2 = new ArrayList<Integer>();
		for(String s : inp1)
			que1.add(Integer.parseInt(s));
		for(String s : inp2)
			que2.add(Integer.parseInt(s));
		if((totalSum(que1)+totalSum(que2))%2!=0)
		{
			System.out.println("-1");
			System.exit(0);
		}
		else if(totalSum(que1)==totalSum(que2)) {
			System.out.println("0");
			System.exit(0);
		}
		while(totalSum(que1)!=totalSum(que2)) {
			if(totalSum(que1)<totalSum(que2))
				popInsert(2,1);
			else
				popInsert(1,2);
		}
		System.out.println(iterations);
	}

}
