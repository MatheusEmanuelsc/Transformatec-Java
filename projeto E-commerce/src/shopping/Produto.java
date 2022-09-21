package shopping;

public class Produto {
	
	private Integer id;
	private String nome;
	private String marca;
	private String descricao;
	private Double preco;
	private Integer estoque;
	
	
	
	
	public Produto(Integer id, String nome, String marca, String descricao, Double preco, Integer estoque) {
		
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	
}
