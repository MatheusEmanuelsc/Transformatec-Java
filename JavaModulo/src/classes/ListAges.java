package classes;

public class ListAges {
	public static void main(String[] args) {
		
		int ages[]= {18,20,19,34,12,18,22,23};
		int i=0;
		boolean m= false;
		while (i<ages.length) {
			System.out.println("Idade: "+ages[i]);
			i++;
		}
		i=0;
		
		while (m==false) {
			if (ages[i]<18) {
				System.out.println("Menor De idade");
				m=true;
				
			} 
			i++;
		}
	}
}
