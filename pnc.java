import java.util.ArrayList;
import java.util.List;

public class pnc {
	
	public static List<String>  subset(String[] strArr){
		
		List<String> output = new ArrayList<>();
		int n = strArr.length;
		
		for(int  i  =(int) Math.pow(2, n);i < (int) Math.pow(2,  n+1);i++) {
			
			String bitMask = Integer.toBinaryString(i).substring(1);
			
//			List<String> curr = new ArrayList<>();
			String curr = "";
			for(int j =0;j<n;j++) {
				if(bitMask.charAt(j) == '1')
					curr+=strArr[j];
			}
			output.add(curr);
			
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCZ";
		
		char[] chArr = s.toCharArray();
		
		String[] sArr = new String[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			sArr[i] =  Character.toString(chArr[i]);
		}
		
		System.out.println(subset(sArr));
	}

}
