package classes;

import java.util.Scanner;

public class HelloScanner {
	public static void main(String[] args) {
		Scanner entraDeDados = new Scanner(System.in);
		System.out.println("informe sseu nome: ");
		String nome = entraDeDados.nextLine();
		entraDeDados.close();
		System.out.println("Seu nome e : "+nome);
	}

}
