package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 8, 3, 6, 4, 2 };

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Second Largest Element " + arr[1]);

	}

}
