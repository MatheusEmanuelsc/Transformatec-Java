package heranca;

public class Veiculo {
	private String modelo;
	private Boolean ligado=false;
	private Integer ano;
	
	
	
	
	public Veiculo(String modelo, Integer ano) {
		
		this.modelo = modelo;
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Boolean getLigado() {
		return ligado;
	}
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
}
