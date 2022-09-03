package classes;

public class ListPers {
	public static void main(String[] args) {
		String persons[]= {"jao","mari","tai"};
		int i=10;
		
		do {
			if (i>persons.length) {
				System.out.println("indice invalido");
				break;
			}
			System.out.println(persons[i]);
			i++;
		}while(i<persons.length);
	}
}
