package stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Produto{
	
	 String nome;
	 Double preco;
	 
	public Produto(String nome, double i) {
		
		this.nome = nome;
		this.preco = i;
	}
	 
	
}
public class Stre {
	public static void main(String[] args) {

		List<Produto>prod= new ArrayList<>();
		
		prod.add(new Produto("notbook", 1200));
		prod.add(new Produto("celular", 600));
		prod.add(new Produto("tablet", 500));
		prod.add(new Produto("fone", 200));
		
		Stream<Produto>stream=prod.stream().filter(prode-> prode.preco<600);
		stream.forEach(prode->System.out.println(prode.nome));
	}
}
