package exptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




class ItemNotFoundExcption extends RuntimeException{
	
	public ItemNotFoundExcption(String msg ) {
		super(msg);
	}
	
	
}


public class Lista {
public static void main(String[] args)  {
	System.out.println("hello world");
	
	List <String> list = new ArrayList<>();
	
	Scanner entradaDeDados = new Scanner(System.in);
	
	
	list.add("leite");
	list.add("pao");
	list.add("queijo");
	list.add("manteiga");
	
	System.out.println("informe o item buscado: ");
	String item= entradaDeDados.nextLine();
	

	try {
		if (!list.contains(item)) {
			throw new ItemNotFoundExcption("Não encontrado item");
		} else {
			System.out.println("item encontrado");
		}
	} catch (ItemNotFoundExcption e) {
		System.out.println("Erro insperado: "+ e.getMessage());
	}catch (Exception e) {
		System.out.println("Erro insperado: "+ e.getMessage());
	}finally {
		entradaDeDados.close();
	}
	
}
}
