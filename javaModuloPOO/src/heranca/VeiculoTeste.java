package heranca;



public class VeiculoTeste {
	public static void main(String[] args) {
		
		Carro carro= new Carro("sport", 2015, "azul", 20000d);
		
		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.getAno());
		System.out.println(carro.getLigado());
        carro.setLigado(true);
        System.out.println(carro.getLigado());
        
	}
}
