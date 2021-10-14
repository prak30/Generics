
public class MaximumNumber {
	public static float findMax(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		float maxNumber = MaximumNumber.findMax(2.5f,12.8f,10.2f);
		System.out.println("Maximum number :" +maxNumber);
	}
}

