import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class POD_5_1 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine().trim());
		HashMap<String, String> language_dict = new HashMap<String, String>();
		ArrayList<String> inputs = new ArrayList<String>();
		
		
		for (int i = 0; i < n; i++) {
			String[] str = scan.nextLine().trim().split(" ");
			String value = str[0];
			for (int j = 1; j < str.length; j++) {
				language_dict.put(str[j], value);
			}
		}

		scan.nextLine();
		
		
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			if (s == "" || s == null)
				break;
			else
				inputs.add(s);
		}
		scan.close();

		for (String input : inputs) {

			String[] inp_parts = input.split("[,!.;?()\\s]");
			for (int i = 0; i < inp_parts.length; i++) {
				if (language_dict.containsKey(inp_parts[i])) {
					System.out.println(language_dict.get(inp_parts[i]));
					break;
				}
			}

		}

	}

}
