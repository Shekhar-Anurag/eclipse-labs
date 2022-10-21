
public class a1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "assignment1";
		String c = s.replaceAll("[aeiou0-9]", "");
		String oth = s.replaceAll("^[a-z]+","");
		String v = s.replaceAll("[^aeiou]", "").replaceAll("[0-9]", "");
		
		System.out.println(c);
		System.out.println(oth);
		System.out.println(v);
		
		String c1 ="",oth1="",v1="";
		
		for(int i = 0;i<c.length();i++) {
//			Char
		}
		
	}

}
