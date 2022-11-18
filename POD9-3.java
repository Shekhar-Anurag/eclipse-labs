package PODS;

import java.util.*;

/*
aacc
2

aaccd
2

cccccdeeefff
2

ccccceeef
2
 */

public class POD9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        ArrayList<String> subsets = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                subsets.add(s.substring(i, j + 1));
            }
        }

        TreeMap<Integer, String> map = new TreeMap<>();

        for (String ss : subsets) {
            char[] ct = new char[128];
            TreeSet<Character> uc = new TreeSet<>();
            TreeSet<Character> uuc = new TreeSet<>();
            boolean shouldInclude = true;

            for (char c : ss.toCharArray()) {
                ct[c]++;
                uuc.add(c);
            }
            for (char c : uuc) {
                if (ct[c] >= k) uc.add(c);
                else {
                    shouldInclude = false;
                    break;
                }
            }
            int sl = ss.length();
            String v = map.getOrDefault(uc.size(), "-1");
            int vl = v.length();
            boolean isSubLenMax = Math.max(vl, sl) == sl;
            map.put(uc.size(), ((isSubLenMax && shouldInclude) || v.equals("-1")) ? ss : v);
        }

        String res = map.lastEntry().getValue();

        System.out.println(res.length());
    }
}
