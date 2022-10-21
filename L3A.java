import java.util.ArrayList;
import java.util.Scanner;

public class L3A {
	
	public static int compareString(String s1,String s2) {
		
		if(s1=="" || s2 =="")
			return 0;
		if(s1.equals(s2))
			return s1.length();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int minLen = 0;
		
		if(c1.length<c2.length)
			minLen = c1.length;
		else
			minLen = c2.length;
		
		int count = 0;
		
		for(int i =0;i<minLen;i++)
		{
			if(c1[i]==c2[i])
				count++;
			else
				break;
		}
		
		
		return count;
	}
	
	public static void main(String... strings) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		s.nextLine();
		for(int i =1;i<=n;i++) {
			String s1 = s.nextLine();
			String s2 = s.nextLine();
			result.add(compareString(s1,s2));
		}
		
		for(int i:result )
			System.out.println(i);
		s.close();
	}
}
