package animals;

public class AnimalTeste {

	public static void main(String[] args) {
		
		
		Cat gato=new  Cat("peixe", "gatao");
		System.out.println("o nome do gato e: "+gato.getComida());
		System.out.println(gato.getComida());
		
	Dog cachorro = new Dog("carne","max" , "vira-lata");
	System.out.println("O cachorro : "+cachorro.getName()+" da raça: "+cachorro.getPedigree());
	}

}
