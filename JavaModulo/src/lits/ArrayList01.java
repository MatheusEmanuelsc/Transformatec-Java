package lits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		
		List<Integer>num = new ArrayList<>();
		
		num.add(21);
		num.add(200);
		num.add(34);
		num.add(14);
		num.add(54);
		
		
		System.out.println(num.get(2));
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		num.remove(1);
		System.out.println(num);
		
	}
}
