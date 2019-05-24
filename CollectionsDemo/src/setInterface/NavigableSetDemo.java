package setInterface;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		for (int i = 0; i < 11; i++) {
			ts.add(i);
		}
		ts.add(124);
		ts.add(291);
		ts.add(100);
		ts.add(130);
		ts.add(40);
		ts.add(180);
		ts.add(192);
		System.out.println(ts);
		System.out.println("Floor= " + ts.floor(55));
		System.out.println("Lower = "+ ts.lower(126));
		System.out.println("Ceiling= " + ts.ceiling(134));
		System.out.println("Higher= "+ ts.higher(201));
		System.out.println("Poll First=  " + ts.pollFirst());
		System.out.println("Poll Last=  "+ ts.pollLast());
		System.out.println(ts.descendingSet());
	}

}
