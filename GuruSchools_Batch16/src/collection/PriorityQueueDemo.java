package collection;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("India");
		queue.add("USA");
		queue.add("South Africa");
		queue.add("Swiss");

		//System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.removeAll(queue));
		System.out.println(queue.peek());
		System.out.println(queue.size());
		//System.out.println(queue.remove());
		//System.out.println(queue.peek());

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// Adding elements to the PriorityQueue
		pq.add(10);
		pq.add(5);
		pq.add(20);

		// Retrieving the head of the PriorityQueue using element()
		try {
			int head = pq.element();
			System.out.println("Head of the queue: " + head);
		} catch (NoSuchElementException e) {
			System.out.println("The queue is empty");
		}
	}

}
