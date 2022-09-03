package classes;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		System.out.println("bonus no salario");
		Scanner scan = new Scanner (System.in);
		System.out.println("digite seu salario: ");
		double salario= scan.nextDouble();
		scan.close();
		double salarioComBonus=salario>=1.500? salario*1.10: salario*1.20;
		System.out.println("seu salario com bonus agora e de : "+ Math.round(salarioComBonus));
		
		
	}
}
