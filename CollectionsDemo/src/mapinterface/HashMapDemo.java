package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "A");
		hm.put(2, "A");
		hm.put(3, "A");
		hm.put(4, "A");
		hm.put(5, "A");
		hm.put(6, "A");
		hm.put(1, "B");		
		System.out.println(hm);
		System.out.println("Size =" + hm.size());
		System.out.println("Is Empty =  "+ hm.isEmpty());
		
		Set s=hm.keySet();
		System.out.println("Set of Keys=  " + s);
		Collection c=hm.values();
		System.out.println("Collection Values = "+ c);
		Set s1=hm.entrySet();
		System.out.println("Entry Set = " + s1);
		Iterator itr=s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
