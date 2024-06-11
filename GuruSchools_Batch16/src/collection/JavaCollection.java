package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollection {

	public static void main(String[] args) {
		// Declare ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dilip");
		list.add("Asra");
		list.add("Priti");
		list.add("Ganesh");
		list.add("Sachin");
		list.add("Heena");
		list.add("Raman");
		list.add("Purnima");
		list.add("Raji");
		list.add("Anand");
		System.out.println(list.size());
		list.remove(9);//10th object
		
		list.set(2, "Priti bhatt");
		Iterator itr = list.iterator();
		
		//print all the values after adding
		while(itr.hasNext())//true or false
		{
			System.out.println(itr.next());
		}
		
		System.out.println(list.size());
		
		ArrayList<Double> list2 = new ArrayList<Double>();
	}

}
