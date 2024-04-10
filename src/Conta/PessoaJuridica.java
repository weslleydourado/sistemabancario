package Conta;

public class PessoaJuridica extends Cliente {

	public PessoaJuridica(String cpf, String cnpj, String nomeDoTitular, String tipoDeConta, String dataCadastro,
			boolean status) {
		super(cpf, cnpj, nomeDoTitular, tipoDeConta, dataCadastro, status);
	}

}
