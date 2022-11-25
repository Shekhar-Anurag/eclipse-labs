import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POD9_1 {

	static int maxSum = Integer.MIN_VALUE;

	static void calcPossibleSums(List<Integer> al) {
//		System.out.println("******************************************");
//		System.out.println(al);

		for (int i = 1; i < al.size(); i++) {
			List<Integer> leftAl = al.subList(0, i);
			List<Integer> rightAl = al.subList(i, al.size());
//			System.out.println("################");
//			System.out.println("Left Array : "+leftAl);
//			System.out.println("Right Array : "+rightAl);
			Integer lSum = leftAl.stream().mapToInt(Integer::intValue).sum();

			Integer rSum = rightAl.stream().mapToInt(Integer::intValue).sum();
			if (lSum == rSum)
				maxSum = (maxSum <= lSum) ? lSum : maxSum;
//			System.out.println("################");

		}
//		System.out.println("******************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] inp = scan.nextLine().trim().split(" ");
		scan.close();
		List<Integer> inputs = new ArrayList<Integer>();
		for (String s : inp)
			inputs.add(Integer.parseInt(s));

		int winSize = 2;

//		if (inputs.size() == 1) {
//			System.out.println(inputs.get(0));
//			System.exit(0);
//		}

		while (winSize <= inputs.size()) {
			for (int i = 0; i <= inputs.size() - winSize; i++)
				calcPossibleSums(inputs.subList(i, i + winSize));
			winSize++;
		}

		if (maxSum <= 0)
			System.out.println("0");
		else
			System.out.println(maxSum);

	}
}
