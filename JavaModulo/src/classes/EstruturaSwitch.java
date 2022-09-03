package classes;

import java.util.Scanner;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		
		System.out.println("digite 1 para netflix");
		System.out.println("digite 2 para hbo");
		System.out.println("digite 3 para disney plus");
		
		Scanner entradaDeDados = new Scanner (System.in);
		int num= entradaDeDados.nextInt();
		
		switch (num) {
		case 1: {
			
			System.out.println("vc escolheu netflix");
			break;
		}
		case 2:{
			System.out.println("vc escolheu hbo");
			break;
		}
		case 3 :{
			System.out.println("disney plus");
			break;
		}
		default:
			System.out.println("numero invalido ");
			break;
		}
		entradaDeDados.close();
		
	}

}
