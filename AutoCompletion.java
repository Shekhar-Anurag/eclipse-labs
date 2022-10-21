import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AutoCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] inputs = scan.nextLine().split(",");
		scan.close();
		String[] output = new String[inputs.length];
		// HashMap<String,String> dict = new HashMap<String,String>();
		for (int i = 0; i < inputs.length; i++) {
			String s = inputs[i];
			int begin = 0;
			int end = 1;
			String uc = s.substring(begin, end);
			for (int j = i+1; j < inputs.length && end<=s.length(); j++) {
				System.out.println(i +" ..."+ j);
				if (!(i== j)) {
					System.out.println("J string :"+ inputs[j].substring(begin, end));
					System.out.println("UC is"+uc);
					if (inputs[j].substring(begin, end).equals(uc)) {
						System.out.println("here");
						end++;
						if(end<=s.length())
							uc = s.substring(begin, end);
						System.out.println("UC is"+uc);
					} 
				}
			}
			output[i]=uc;
			
		}
		
		System.out.println("Input "+Arrays.toString(inputs));
		System.out.println("Output "+Arrays.toString(output));
	}

}
