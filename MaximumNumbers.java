
public class MaximumNumbers<E extends Comparable> {
	E x,y,z;
	public MaximumNumbers(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static<E extends Comparable> E findMax(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		//int maxNumber = MaximumNumbers.findMax(2,12,10);
		//System.out.println("Maximum number :" +maxNumber);
		System.out.println("Maximum number (INTEGER) :" +findMax(2,10,20));
		System.out.println("Maximum number (FLOAT) :" +findMax(2.1f,10.5f,15.9f));
		System.out.println("Maximum string :" +findMax("apple","banana","mango"));
	}
}



