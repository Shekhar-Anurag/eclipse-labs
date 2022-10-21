import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class L2A {
	
	static String old = "old enough";
	static String young = "too young";
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = sdf.parse("18/04/2022");
//		System.out.println(d2.toString());
		scanner.nextLine();
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0;i<n;i++) {
			String inp = scanner.nextLine();
			inp = inp.replaceAll(" ","/");
			Date d1 = sdf.parse(inp);
			
			long diffInMillies = Math.abs(d2.getTime() - d1.getTime());
		    long days = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		    
			double years = days/365;
			
			if(years>=13)
				result.add(old);
			else
				result.add(young);
			
		}
		for(String s : result)
			System.out.println(s);
		scanner.close();
	}

}
