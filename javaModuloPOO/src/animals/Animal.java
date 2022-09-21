package animals;

public class Animal {

	private String comida;

	public Animal(String comida) {

		this.comida = comida;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

}

class Cat extends Animal {
	private String name;

	public Cat(String comida, String name) {
		super(comida);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
class Dog extends Animal{
	
	private String name;
	private String pedigree;
	
	
	
	
	public Dog(String comida, String name, String pedigree) {
		super(comida);
		this.name = name;
		this.pedigree = pedigree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPedigree() {
		return pedigree;
	}
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
	
	
}