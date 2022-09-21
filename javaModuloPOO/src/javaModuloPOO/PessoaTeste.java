package javaModuloPOO;


public class PessoaTeste {

	static Pessoa pessoa= new Pessoa("jao", 27, "dev");
	
	public static void main(String[] args) {
		pessoa.getName();
		pessoa.getIdade();
		pessoa.getProfissao();
		
		pessoa.setProfissao("professor");
		pessoa.getProfissao();
	}
}
