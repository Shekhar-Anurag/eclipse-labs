import java.util.Scanner;

public class POD_4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String inp = s.nextLine();
		s.close();
		int n = inp.length();
		String cpy = inp;
		for(int i =0;i<(n/2);i++) {
			char ch = cpy.charAt(i);
			if(ch=='(')
			{	
				char ch1 =')';
				if(cpy.indexOf(ch1, i+1)>=0) {
					inp = inp.replace(Character.toString(ch),"").replace(Character.toString(ch1), "");	
					n=n-2;
					System.out.println(1);
				}
				
			}
			
			if(ch=='[')
			{	
				char ch1 =']';
				if(cpy.indexOf(ch1, i+1)>=0) {
					inp = inp.replace(Character.toString(ch),"").replace(Character.toString(ch1), "");	
					n=n-2;
					System.out.println(1);
				}
			}
			
			if(ch=='{')
			{	
				char ch1 ='}';
				if(cpy.indexOf(ch1, i+1)>=0) {
					inp = inp.replace(Character.toString(ch),"").replace(Character.toString(ch1), "");	
					n=n-2;
					System.out.println(1);
				}
			}
		}
		
		System.out.println((inp.equals(""))?"true":"false");
	}

}
