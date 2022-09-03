package collec;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deq {
	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.add("fut");
		deque.add("rom");
		
		for (String pic : deque) {
			System.out.println(pic);
		}
		System.out.println(deque);
	}
}
