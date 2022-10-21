import java.util.Scanner;

public class Blacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String id_input = scan.nextLine();
		String encr_input = scan.nextLine();
		
		String[] ids = id_input.replace("[", "").replace("]", "").split(" ");
		String[] encrs = encr_input.replace("[", "").replace("]", "").split(" ");
		scan.close();
		
		int res = 0;
		
		for(int i = 0;i<encrs.length;i++) {
			String encr = encrs[i].replaceAll("\\*",".");
			String pattern = encr;
//			System.out.println(pattern);
			int count = 0;
			for(int j =0;j<ids.length;j++) {
				if(ids[j].matches(pattern))
					count++;
			}
			if(count>0 && res == 0)
				res = 1;
			if(count > 0)
				res = res * count;
		}
		System.out.println(res);
	}

}
