package banco;

import java.util.Date;

/*
 * Agencia:
 *  atributos: numero, clientes, endereco, telefone.
 *  	criar conta, eliminarConta.
 */
public class Agencia {

	String numero;
	String endereco;
	String telefone;
	public Agencia (String p_numero, String p_endereco, String p_telefone) {
		numero = p_numero;
		endereco = p_endereco;
		telefone = p_telefone;
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
	
}
