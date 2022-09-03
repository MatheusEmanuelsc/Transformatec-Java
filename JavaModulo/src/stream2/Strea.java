package stream2;

import java.util.ArrayList;
import java.util.List;

public class Strea {
	public static void main(String[] args) {


		List<Integer>num= new ArrayList<>();
		
		num.add(3);
		num.add(4);
		num.add(23);
		num.add(12);
		num.add(45);
		num.add(89);
		num.add(27);
		num.add(67);
		num.add(9);
		num.add(5);
		num.add(1);
		
		num.stream().limit(5).filter(nums->nums%2==0).forEach(System.out::println);
	}
}
