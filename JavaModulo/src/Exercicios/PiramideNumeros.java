package Exercicios;

public class PiramideNumeros {
	public static void main(String[] args) {

		int leia = 5;
		int k = 0;
		for (int i = 1; i <= leia; i++, k = 0) {
			for (int spaces = 1; spaces <= leia - i; ++spaces) {

				System.out.print("  ");
			}
			while (k != 2 * i - 1) {
				System.out.print(i+k+" ");
				++k;
			}
			System.out.println();
		}
	}
}
