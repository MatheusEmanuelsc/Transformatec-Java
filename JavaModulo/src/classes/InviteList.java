package classes;

public class InviteList {
	public static void main(String[] args) {
		String[]persons= {"john","jao","gab","billy"};
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		for (String p : persons) {
			System.out.println(p);
		}
	}
}
