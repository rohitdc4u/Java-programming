import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet shortset = new HashSet<>();
		
		for(short i=0;i <100; i++){
			shortset.add(i);
			shortset.remove(i-1);
		}
		System.out.println(shortset.size());

	}

}
