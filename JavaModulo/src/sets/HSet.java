package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class HSet {
	public static void main(String[] args) {

		LinkedHashSet<Integer> num = new LinkedHashSet<>();


		num.add(4);


		num.add(2);
		num.add(5);
		num.add(7);

		Set<Integer> num2 = new LinkedHashSet<>();

		num2.add(1);

		num2.add(9);
		num2.add(3);
		
		System.out.println(num.contains(num2));
		
		System.out.println(num);
		System.out.println(num2);
		
		num.addAll(num2);
		
		System.out.println(num);
		

		
		

	}
}
