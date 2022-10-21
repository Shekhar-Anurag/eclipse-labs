import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class L4A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		HashMap<Character,Integer> wordFrequency = new HashMap<Character,Integer>();
		ArrayList<Character> repeated = new ArrayList<Character>();
		ArrayList<Character> non_repeated = new ArrayList<Character>();
		while(input.length()>0) {
			char ch = input.charAt(0);
			System.out.println(ch);
			int count = (int)input.chars().filter(c -> c == ch).count();
			input = input.replaceAll(Character.toString(ch), "");
			System.out.println(input);
			wordFrequency.put(ch,count);
		}
		boolean output = true;
		for(HashMap.Entry<Character,Integer> wf : wordFrequency.entrySet() ) {
			char key = wf.getKey();
			int value = wf.getValue();
			
			if(value%2==0) // update to value == 2 and repeated or non_repeated add logic
			{
				repeated.add(key);
			}
			else {
				output = false;
				non_repeated.add(key);
			}
				
		}
		Collections.sort(repeated);
		Collections.sort(non_repeated);
//		System.out.println(wordFrequency);
		
		if(output) {
			for(int i = 0;i<repeated.size();i++)
				System.out.print(repeated.get(i)+" ");
			System.out.print("yes");	
		}
		else {
			for(int i = 0;i<non_repeated.size();i++)
				System.out.print(non_repeated.get(i)+" ");
			System.out.print("no");
		}
		scan.close();
	}

}
