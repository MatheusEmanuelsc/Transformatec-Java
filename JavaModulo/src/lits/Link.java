package lits;

import java.util.LinkedList;
import java.util.List;

public class Link {
	public static void main(String[] args) {
		
		List<String>names = new LinkedList<>();
		
		names.add("jao");
		names.add("gao");
		names.add("bao");
		names.add("mao");
		names.add("nao");
		names.add("lao");
		names.add("tao");
		
		System.out.println(names);
		
		System.out.println(names.get(0));
		System.out.println(names.contains("nao"));
		names.set(0, "jon");
		System.out.println(names);
	}
}
