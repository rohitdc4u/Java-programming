import java.util.Scanner;

public class firstalphacaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();

		StringBuilder result = new StringBuilder(str.length());
		String[] words = str.split(" ");

		for (int i = 0; i < str.length(); i++) {
			result.append(words[i].charAt(0)).append(words[i].substring(1)).append(" ");
		}
		System.out.println("the output is: " + result);

	}

}
