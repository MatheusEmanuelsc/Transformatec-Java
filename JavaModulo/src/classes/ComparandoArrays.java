package classes;

public class ComparandoArrays {
	public static void main(String[] args) {

		int numbers[]= {1,2,3,4,5,6,7,8};
		int numbers2[]= {1,2,3,4,5,6,7,8};
		
		if (numbers== numbers2) {
			System.out.println("igual");
		} else {
			System.out.println("diferentes");
		}
		boolean same= true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]!=numbers2[i]) {
				same=false;
			}
		}
		System.out.println(same);
	}
}
