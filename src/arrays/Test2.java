package arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a demo of the getchars method";
		int start = 10;
		int end = 14;
		
		char[] buf = new char[4];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);

	}

}
