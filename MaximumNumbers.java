
public class MaximumNumbers {
	public static<T extends Comparable> T findMax(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		//int maxNumber = MaximumNumbers.findMax(2,12,10);
		System.out.println("Maximum number (INTEGER) :" +findMax(2,10,15));
		System.out.println("Maximum number (FLOAT) :" +findMax(2.1f,10.5f,15.9f));
		System.out.println("Maximum string :" +findMax("apple","banana","mango"));
	}
}


