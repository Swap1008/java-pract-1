package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(100, "ABC");
		hm.put(101, null);
		hm.put(102, "ABC");
		System.out.println(hm);
		hm.put(100,"CDE");
		hm.put(null, null);
		hm.put(null, null);
		System.out.println(hm);
		System.out.println("Size=" + hm.size());
//		hm.clear();
//		System.out.println(hm.isEmpty());
		Set s=hm.keySet();
		Collection c=hm.values();
		
		System.out.println(s);
		System.out.println("Values= " + c);
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsKey(106));
		System.out.println(hm.containsValue(null));
	}

}
