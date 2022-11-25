import java.util.*;
public class cookies {
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        int[] a = new int[st.length];
        for(int i=0; i<st.length; i++)
        {
            a[i] = Integer.parseInt(st[i]);
        }
        int result = 0;
        for(int i=0; i< a.length-1; i++)
        {
            int p1 = a[i];
            int p2 = a[i+1];
            int j=i, k=i+1;
            while (j>=0 && k< a.length) 
            {
                if(p1 == p2) 
                {
                    result = Math.max(result, p1);
                    j--;
                    
                    if(j>=0){
                        p1 += a[j];
                    }

                } 
                else if (p1 > p2) 
                {
                    k++;
                    
                    if(k< a.length) 
                    {
                        p2 += a[k];
                    }

                } 
                else 
                {
                    j--;
                    
                    if(j>=0)
                    {
                        p1 += a[j];
                    }
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
    
}