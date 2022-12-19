public class ArrayMax {
	/** Return the maximum value from arr.*/
	public static int max(int[] arr) {
		int maxNumber = arr[0];
		int index = 1;
		while (index < arr.length) {
			if (maxNumber < arr[index]) {
				maxNumber = arr[index];
			}
			index = index + 1;
		}
		return maxNumber;
	}

	/** Return the maximum value from arr using a for loop.*/
	public static int forMax(int[] arr) {
		int maxNumber = arr[0];
		for(int i=1;i<arr.length;i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{9,2,15,2,22,10,6};
		System.out.println("the maximum value for arr is: " + max(numbers));
		System.out.println("the maximum value for arr is: " + forMax(numbers));
	}
}