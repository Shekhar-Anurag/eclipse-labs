import java.util.ArrayList;
import java.util.Scanner;

public class POD_4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String[] inp = s.nextLine().split(",");
		for(int i =0;i<n;i++) {
			nums.add(Integer.parseInt(inp[i].trim()));
		}
		
		for(int i = 0;i<n;i++)
		{
			if(nums.get(i)==-1) {
				nums.remove(i);
				nums.add(-1);
			}
		}
		
		System.out.println(nums.toString().replaceAll(" ","").replace("[", "").replace("]",""));
	}

}
