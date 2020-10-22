package principal;

import java.util.Date;

import banco.*;

public class Principal {

	public static void main(String[] args) {
		String nome = "Francisco";
		String cpf = "123456789";
		String endereco = "rua ";
		String telefone = "12345678";
		String numero = "123";
		String enderecoA = "teste ";
		String telefoneA = "11111111";
		Date nascimento = new Date();

		Cliente cliente1 = new Cliente(nome, cpf, endereco, telefone, nascimento);
		
		Agencia agencia1 = new Agencia(numero, enderecoA, telefoneA);
		System.out.println("Agencia: " + agencia1.getNumero() + " Rua: " + agencia1.getEndereco() + " Telefone: " + agencia1.getTelefone());
		
		Conta conta1 = new Conta(cliente1, 1);
		System.out.println("Saldo da conta 1: " + conta1.verSaldo());

		Cliente cliente2 = new Cliente(nome, cpf, endereco, telefone, nascimento);
		Conta conta2 = new Conta(cliente2, 2);
		System.out.println("Saldo da conta 2: " + conta2.verSaldo());

		// Metodo deposito
		if (conta1.deposito(50)) {
			System.out.println("Deposito efetuado com sucesso, novo saldo da conta 1: " + conta1.verSaldo());
		}

		// Metodo saque
		if (conta1.sacar(30)) {
			System.out.println("Saque efetuado com sucesso, novo saldo conta 1: " + conta1.verSaldo());
		}
		System.out.println("Saldo da conta 1: " + conta1.verSaldo());
	}


}
