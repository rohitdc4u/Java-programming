
public class DigitSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab12cd3e45f";
		String sum = "";
		int total = 0;

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				{
					sum = sum + c;
				}

			}
			total += Integer.parseInt(sum);
		}
		System.out.println(total);

	}

}
