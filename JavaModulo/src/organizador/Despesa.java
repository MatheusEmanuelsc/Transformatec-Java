package organizador;

public class Despesa {

	private int id;
	private String nome;
	private double valor;
	private String dataDeVencimento;
	private String categoria;
	
	
	
	public Despesa(int id, String nome, double valor, String dataDeVencimento, String categoria) {
		
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.dataDeVencimento = dataDeVencimento;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
