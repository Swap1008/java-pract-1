package setInterface;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(25);
		hs.add(5);
		hs.add(51);
		hs.add(34);
		hs.add(102);
		hs.add(58);
		hs.add(25);
		
		System.out.println(hs);
		hs.remove(5);
		System.out.println(hs);
	}

}
