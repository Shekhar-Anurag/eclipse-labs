import java.util.Scanner;

public class POD4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] s1 = s.nextLine().replace("[","").replace("]", "").split(",");
		String[] s2=s.nextLine().replace("[","").replace("]", "").split(",");
		
		int[] order = new int[s1.length];
		int[] speed = new int[s1.length];
		for(int i = 0;i<s1.length;i++) {
			order[i]=Integer.parseInt(s1[i].trim());
			speed[i]=Integer.parseInt(s2[i].trim());
		}
		
		for(int i =0 ;i<s1.length;i++) {
			int day = i+1;
			for(int j =0;j<s1.length;j++) {
				order[j]=order[j]+(speed[j]*day);
				if(order[j]>=100) {
					
				}
			}
		}
	}

}
