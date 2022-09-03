package organizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DespesaStream {

	public static void main(String[] args) {
		
		
		List<Despesa>listaDeDespesa= new ArrayList<>();
		Scanner entradaDeDados= new Scanner(System.in);
		
		listaDeDespesa.add(new Despesa(3, "luz", 50d, "20/09/23", "1234545"));
		listaDeDespesa.add(new Despesa(3, "carro", 1200d, "20/01/23", "123464"));
		listaDeDespesa.add(new Despesa(3, "condomínio", 500d, "20/10/22", "123455"));
		listaDeDespesa.add(new Despesa(3, "agua", 30d, "20/09/22", "1237845"));
		listaDeDespesa.add(new Despesa(3, "club", 160d, "08/11/23", "1234555"));
		
		System.out.println("Quantos boletos vc deseja pagar? ");
		int qt=Integer.parseInt(entradaDeDados.nextLine());
	
	//	for (int i = 0; i < qt; i++) {
			
	//		int id =i;
			
	//		System.out.println("informe o nome do boleto["+i+"]:");
	//		String nome = entradaDeDados.nextLine();
	//		
	//		System.out.println("informe o valor do boleto["+i+"]:");
	//		double valor = Double.parseDouble(entradaDeDados.nextLine());
			
	//		System.out.println("informe a Data de vencimento do boleto["+i+"]:");
	//		String dataVencimento = entradaDeDados.nextLine();
			
	//		System.out.println("informe a categoria do boleto["+i+"]:");
	//		String categoria = entradaDeDados.nextLine();
			
			
	//		listaDeDespesa.add(new Despesa(id, nome, valor, dataVencimento, categoria));
			
	//	}
		System.out.println("lista de boletos");
		List<Double>lista = listaDeDespesa
				.stream()
				.map(despesa->despesa.getValor())
				.collect(Collectors.toList());
		lista.forEach(valor->System.out.println(valor));
		
		System.out.println("valor total dos boletos");
		Double totalValor= lista.stream().reduce((double)0, (subtotal,valor)-> subtotal+valor);
	
		System.out.println(totalValor);
		
		
	}
}
