
public class MaximumNumber {
	public static<E extends Comparable> void findMax(E array[]) {
		E max = array[0];
		 for (int i = 0; i < array.length; i++) { 
			  if (array[i].compareTo(max) > 0)
	               max = array[i];
			  
		 }
		 System.out.println("Largest element present in given array: " + max);  
		
	}

	public static void main(String[] args) {
		//MaximumNumber m1 = new MaximumNumber();
		Integer arrayInt[] = {1,2,5,7,10};
		Float arrayFloat[] = {1.2f,2.6f,5.4f};
		String arrayString[] = {"Apple","Banana","Peach"};
		findMax(arrayInt);
		findMax(arrayFloat);
		findMax(arrayString);
	}
}

