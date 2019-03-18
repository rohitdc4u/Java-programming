package arrays;

public class MinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 5, 9, 8, 2 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("max element is " + max);

	}

}
