package banco;

/*
 * Agencia:
 *  atributos: numero, clientes, endereco, telefone.
 *  	criar conta, eliminarConta.
 */
public class Agencia {

	private String numero;
	private String endereco;
	private String telefone;
	private Conta contas[];
	private int contadorContas;

	public Agencia(String p_numero, String p_endereco, String p_telefone) {
		this.numero = p_numero;
		this.endereco = p_endereco;
		this.telefone = p_telefone;
		contas = new Conta[100];
		contadorContas = 0;
	}



	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public Conta getContas(int nConta) {
		return contas[nConta];
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

	public int getContadorContas() {
		return contadorContas;
	}

	public void setContadorContas(int contadorContas) {
		this.contadorContas = contadorContas;
	}

	public boolean addConta(Conta nova) {
		if(contadorContas < 100) {
		contas[contadorContas] = nova;
		contadorContas++;
		return true;
		}else{
			return false;
		}
	}
}
