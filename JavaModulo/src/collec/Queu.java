package collec;

import java.util.PriorityQueue;

public class Queu {
	public static void main(String[] args) {
		
		PriorityQueue<String>nome= new PriorityQueue<>();
		
		nome.add("car");
		nome.add("ca");
		nome.add("ra");
		nome.add("ar");
		nome.add("tac");
		nome.add("char");
		nome.add("vi");
		
		System.out.println(nome);
		
		System.out.println(nome.peek());
		
		System.out.println(nome);
		
		System.out.println(nome.poll());
		
		
		
	}
}
