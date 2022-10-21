import java.util.ArrayList;
import java.util.Scanner;

public class Tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		String s = sc.nextLine();
		al.add(s);
		while(s.length() > 0)
		{
		  s = sc.nextLine();
		  if(s==""||s== null)
			 ; 
		  else
			  al.add(s);
		}
		System.out.println(al);
	}

}
