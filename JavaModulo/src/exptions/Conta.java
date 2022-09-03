package exptions;

public class Conta {
	
	private Integer numero;
	private Double saldo;
	private String nome;

	public Conta(Integer numero, Double saldo, String nome) {

		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(Double valor) throws ArithmeticException{
		if (valor<=0) {
			throw new ArithmeticException("valor invalido");
		} else {
			setSaldo(getSaldo()+valor);
		}
	}
}
