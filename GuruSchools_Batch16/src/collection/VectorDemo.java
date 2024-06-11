package collection;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(v.size());
		v.remove(0);
		System.out.println(v.size());
		
		//Declare stack object of type double
		Stack<Double> stack = new Stack<Double>();
		stack.add(12.34);
		stack.add(145.2);
		stack.add(15.2);
		
		Iterator<Double> itr2 = stack.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
