
public class MaximumNumber {
	public static int findMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		int maxNumber = MaximumNumber.findMax(2,12,10);
		System.out.println("Maximum number :" +maxNumber);
	}
}

