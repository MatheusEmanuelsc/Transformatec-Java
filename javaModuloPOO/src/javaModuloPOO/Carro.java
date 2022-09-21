package javaModuloPOO;

public class Carro {
	private String modelo;
	private Integer ano;
	private String marca;
	private Double peso;
	
	
	
	public Carro(String modelo, Integer ano, String marca, Double peso) {
		
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.peso = peso;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
}
