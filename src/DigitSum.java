
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab12cd3ef45";
		String num = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			} else {
				if (!num.equals("")) {

					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);

	}

}
