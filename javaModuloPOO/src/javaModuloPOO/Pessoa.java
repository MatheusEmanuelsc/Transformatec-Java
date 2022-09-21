package javaModuloPOO;

public class Pessoa {
	private String name;
	private Integer idade;
	private String profissao;
	
	
	public Pessoa(String name, Integer idade, String profissao) {
		
		this.name = name;
		this.idade = idade;
		this.profissao = profissao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
