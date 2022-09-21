package heranca;

public class Carro extends Veiculo {

	private String cor;
	private Double preco;
	
	
	
	
	
	public Carro(String modelo, Integer ano, String cor, Double preco) {
		super(modelo, ano);
		this.cor = cor;
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getPrec0() {
		return preco;
	}
	public void setPrec0(Double prec0) {
		this.preco = prec0;
	}
	
	
}
