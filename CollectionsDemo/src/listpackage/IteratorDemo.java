package listpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		
		for (int i = 1; i < 10; i++) {
			a.add(i);
		}
		Iterator itr=a.iterator();
		while (itr.hasNext()) {
//			System.out.print( itr.next()+" ");
//				Integer i=(Integer)itr.next();
			itr.next();
			itr.remove();
			itr.forEachRemaining(System.out::print);
		}
//		
		System.out.println();
		ListIterator ltr=a.listIterator();
		while (ltr.hasPrevious()) {
			System.out.print(ltr.previous() +" ");
			
		}
		
//		?System.out.println(a);
	}

}
