import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab4B {
	static String U = "Unigram ";
	static String B = "Bigram ";
	static String T = "Trigram ";

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		ArrayList<String> sortedOutput = new ArrayList<String>();
		
		//Input
		int line = s.nextInt();
		s.nextLine();
		String[] lines = new String[line];
		for(int i = 0;i<line;i++) 
			lines[i] = s.nextLine();
		
		int nGram = s.nextInt();
		
		//Logic : finding nGram and count
		for(int i = 0; i<line;i++) {
			int len = lines[i].length();
			int limit = ((nGram==1)?len:(len-nGram+1));
			for(int j = 0; j<limit;j++) {
				String subStr = lines[i].substring(j,j+nGram);
//				if(subStr.matches("[a-z]+"))
				if(!(subStr.contains(" ") || subStr.contains(",") || subStr.contains(".") || subStr.contains("\n")) )
				{
					if(count.containsKey(subStr))
						count.put(subStr, count.get(subStr)+1);
					else
						count.put(subStr, 1);
				}
			}
		}
		
		System.out.println(count);
		
		// logic : finding ngram(s) with max count
		int maxCnt =0;
		
		for(HashMap.Entry<String,Integer> wordCount : count.entrySet()){
			if(wordCount.getValue()==maxCnt) 
				sortedOutput.add(wordCount.getKey());
			else if(wordCount.getValue()>maxCnt) {
				maxCnt = wordCount.getValue();
				sortedOutput.clear();
				sortedOutput.add(wordCount.getKey());
			}
		}
		
		//output
		Collections.sort(sortedOutput);
		
		if(nGram==1)
			System.out.println(U+sortedOutput.get(0));
		else if(nGram==2)
			System.out.println(B+sortedOutput.get(0));
		else if(nGram==3)
			System.out.println(T+sortedOutput.get(0));
		
		s.close();
		
	}

}
