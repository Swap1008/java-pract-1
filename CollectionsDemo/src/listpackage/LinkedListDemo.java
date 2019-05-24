package listpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		for (int i = 1; i <11; i++) {
			al.add(i);
		}
		LinkedList ll=new LinkedList(al);
		System.out.println(ll);
		ll.addFirst(101);
		ll.addLast(500);
//		System.out.println("Linked List"+ll);
		Iterator itr=ll.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		
//	For Each
		System.out.println("For Each");
		for (Object obj : ll) {
			System.out.print(obj +" ");
		}
	}

}
