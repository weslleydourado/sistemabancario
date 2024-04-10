package Conta;

public abstract class Cliente {
	
	private static int count = 1;
	
	private String cpf;
	private String cnpj;
	private String nomeDoTitular;
	private String tipoDeConta;
	private String dataCadastro;
	private boolean status;
	
	// Implementação do construtor
	public Cliente(String cpf, String cnpj, String nomeDoTitular, String tipoDeConta, String dataCadastro, boolean status) {
		//super();
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nomeDoTitular = nomeDoTitular;
		this.tipoDeConta = tipoDeConta;
		this.dataCadastro = dataCadastro;
		this.status = status;
		count += 1;
	}
	
	
	// getters e setters
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Cliente.count = count;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	
	public String toString() {
		return "\nNome: " + this.getNomeDoTitular() +
		       "\nCPF: " + this.getCpf()+
		       "\nModalidade: " + this.tipoDeConta +
		       "\nConta: " + this.getStatus();
	}
	
}
