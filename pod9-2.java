import java.util.Scanner;

public class pod0_2 {
    public static int numDecodings(String s) {
        
    	if (s == null || s.length() == 0) 
            return 0;
        int n = s.length();
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
//        	System.out.println("i is : "+ i);
            int first = Integer.valueOf(s.substring(i - 1, i));
//            System.out.println("first is : "+ first);
            int second = Integer.valueOf(s.substring(i - 2, i));
//            System.out.println("second is : "+ second);
            if (first >= 1 && first <= 9)
               count[i] += count[i-1];  
            if (second >= 10 && second <= 26) 
                count[i] += count[i-2];
            
        }
        return count[n];
    }
    
    public static void main(String... args) {
    	
    	Scanner scan = new Scanner(System.in);
    	String s = scan.nextLine().trim();
    	scan.close();
    	System.out.println(numDecodings(s));
    }
}