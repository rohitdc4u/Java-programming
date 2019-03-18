package arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "27-10-2019";
		String s1 = date.substring(0,2);
		
	//	String[] arr = {"1","2","3","4","5","6","7"};
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i < arr.length; i++) {
			if(s1.equals(arr[i])){
				System.out.println("discount = 5%");
				break;
			}else {
				System.out.println("discount = 10%");
				break;
			}
			
		}

	}

}
