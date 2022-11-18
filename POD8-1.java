import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class POD8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().trim().split(" ");
		scan.close();
		ArrayList<String> inputs = new ArrayList<String>();
		ArrayList<String> uniqueInputs = new ArrayList<String>();
		for (String s : str) {
			inputs.add(s);
			if (!uniqueInputs.contains(s))
				uniqueInputs.add(s);
		}
		int length = uniqueInputs.size();
		if(length == 1)
		{
			System.out.println("1 1");
			System.exit(0);
		}
		else if (length == inputs.size()) {
			System.out.println("1 "+inputs.size());
			System.exit(0);
		}
			
		int res1=0, res2=0;
		while (length <= inputs.size()) {
			boolean found = false;
			for (int i = 0; i < inputs.size() - length+1; i++) {
				
				int j = i + length - 1;
				List<String> outputs = inputs.subList(i, j+1);
				Set<String> targetSet = new HashSet<String>(outputs);
//				System.out.println(targetSet);
				if (targetSet.size() == uniqueInputs.size()) {
					res1 = i + 1;
					res2 = j + 1;
					found = true;
					break;
				}
			}
			if(found)
				break;
			else
				length++;
		}
		
		System.out.println(res1+" "+res2);

	}

}
