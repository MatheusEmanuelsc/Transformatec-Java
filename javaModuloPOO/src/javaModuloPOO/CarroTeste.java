package javaModuloPOO;

public class CarroTeste {
	public static void main(String[] args) {

		Carro carro= new Carro("Sport", 2022,"ford" , 1000d);
		Carro carro2= new Carro("economico", 2017,"fiat" , 700d);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getMarca());
		System.out.println(carro.getAno());
		System.out.println(carro.getPeso());
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getPeso());
		
		carro2.setAno(2012);
		System.out.println(carro2.getAno());
	}
}
