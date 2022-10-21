
public class Assignment1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 111, 1 };

		int arLen = arr.length;
		int dist = -1, diff = -1, t1=Integer.MIN_VALUE, t2 = Integer.MIN_VALUE;

		for (int i = 0; i < arLen; i++) {
			for (int j = i + 1; j < arLen; j++) {
				if (Math.abs(arr[i] - arr[j]) == 10) {
					if (dist < (j - i - 1) ) {
						dist = j - i -1 ;
					}
				}
				
				if (j==i+1) {
					if(diff < Math.abs(arr[i] - arr[j])){
						t1 = arr[i];
						t2 = arr[j];
						diff = Math.abs(arr[i] - arr[j]);
					}
				}
			}
		}
		
		System.out.println(dist);
		System.out.println(t1+","+t2);

	}

}
