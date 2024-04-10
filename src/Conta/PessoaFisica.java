package Conta;

public class PessoaFisica extends Cliente  {

	public PessoaFisica(String cpf, String cnpj, String nomeDoTitular, String tipoDeConta, String dataCadastro,
			boolean status) {
		super(cpf, cnpj, nomeDoTitular, tipoDeConta, dataCadastro, status);
	}

}
