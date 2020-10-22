package banco;
/*
 * conta:
 * atribuos: cliente, saldo
 * metodos: deposito, saque, versaldo
 */

public class Conta {
	private Cliente titular;
	private int numero;
	private double saldo;

	public Conta(Cliente p_cliente, int p_numero) {
		this.titular = p_cliente;
		this.numero = p_numero;
		this.saldo = 0;
	}

	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}

	public boolean saque (double valor) {
		if(saldo > valor)
			return false;
		saldo -= valor;
		return true;
	}
public boolean sacar (double valor) {
	if((saldo-valor)>=0) {
		saldo -=valor;
		return true; 
	}
	return false;	
	}

	public double verSaldo() {
		return saldo;
	}
}
