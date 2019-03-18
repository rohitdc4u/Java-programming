import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, tempnum;
		int reversenum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		tempnum = num = sc.nextInt();

		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;

		}
		System.out.println("reverse of num : " + reversenum);

	}

}
