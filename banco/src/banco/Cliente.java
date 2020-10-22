package banco;

import java.util.Date;

/*
* Classes de banco
* Cliente:
* 	atributos: nome, cpf, nascimento, endereco, telefone, agencia, conta 
* Metodos: adicionarAgencia, adicionarConta, cancelarConta
* 
* 
*/
public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Date nascimento;
	private int agencia;
	private int conta;

	public Cliente(String p_nome, String p_cpf, String p_endereco, String p_telefone, Date p_nascimento) {
		nome = p_nome;
		cpf = p_cpf;
		endereco = p_endereco;
		telefone = p_telefone;
		nascimento = p_nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void vincularAgencia(int n_agencia) {
		agencia = n_agencia;
	}

	public void vincularConta(int n_conta) {
		conta = n_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

}
