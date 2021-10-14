
public class MaximumNumber {
	public static String findMax(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		String maxString = MaximumNumber.findMax("apple","banana","peach");
		System.out.println("Maximum string :" +maxString);
	}
}

