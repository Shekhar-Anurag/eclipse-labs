
public class assignment1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "assignment1";
			String vowels = str.replaceAll("[^aeiou]", "");
			String consonants = str.replaceAll("[aeiou0-9]", "");
			String others = str.replaceAll("[a-z]", "");
			
			System.out.println(consonants+"...."+others+"...."+vowels);
			for(int i =0;i<consonants.length();i++) {
				String substr1 = consonants.substring(i, i+1);
				String substr2 = consonants.substring(i+1);
				if(substr2.contains(substr1))
				{
					int conLen1 = consonants.length(); 
					consonants = consonants.replaceAll(substr1, "");
					int conLen2 = conLen1-consonants.length();
					consonants = consonants+substr1;
					i= i-conLen2+1;
				}
//				System.out.println(substr1+"...."+ substr2+"...."+i);
			}
			
			for(int i =0;i<others.length();i++) {
				String substr1 = others.substring(i, i+1);
				String substr2 = others.substring(i+1);
				if(substr2.contains(substr1))
				{
					int conLen1 = others.length(); 
					others = others.replaceAll(substr1, "");
					int conLen2 = conLen1-others.length();
					others = others.concat(substr1);
					i= i-conLen2+1;
				}
//				System.out.println(substr1+"...."+ substr2+"...."+i);
			}
			
			for(int i =0;i<vowels.length();i++) {
				String substr1 = vowels.substring(i, i+1);
				String substr2 = vowels.substring(i+1);
				if(substr2.contains(substr1))
				{
					int conLen1 = vowels.length(); 
					vowels = vowels.replaceAll(substr1, "");
					int conLen2 = conLen1-vowels.length();
					vowels = vowels.concat(substr1);
					i= i-conLen2+1;
				}
//				System.out.println(substr1+"...."+ substr2+"...."+i);
			}
			
			
			System.out.println(consonants+others+vowels);
	}

}
