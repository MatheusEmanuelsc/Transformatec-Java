package classes;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("Quantas idades vc deseja armazenar?");
		int n = entradaDeDados.nextInt();
		int[] idade = new int[n];

		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite a " + (i + 1) + " idade: ");
			idade[i] = entradaDeDados.nextInt();
		}
		entradaDeDados.close();
		for (int i : idade) {
			System.out.println("idade : " + i);
		}

	}
}
