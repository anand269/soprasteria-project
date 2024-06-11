package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Linked List Demo decalration
		LinkedList<String> lnk = new LinkedList<String>();
		lnk.add("Cricket");
		lnk.add("Rugbe");
		lnk.add("Football");
		lnk.add("Shuttle badminton");
		lnk.add("Wrestling");
		
		Iterator<String> itr = lnk.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		lnk.removeFirst();lnk.removeLast();lnk.clear();
		System.out.println(lnk);
		
	}

}
