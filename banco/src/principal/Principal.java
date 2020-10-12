package principal;

import java.util.Date;

import banco.*;

public class Principal {
	
	public static void main(String[] args) {
		String nome = "Francisco";
		String cpf = "123456789";
		String endereco = "rua ";
		String telefone = "12345678";
		Date nascimento = new Date();

		Cliente cliente1 = new Cliente(nome, cpf, endereco, telefone, nascimento);
		Cliente cliente2 = new Cliente(nome, cpf, endereco, telefone, nascimento);

		Conta conta1 = new Conta(cliente1, 1);
		System.out.println("Saldo da conta: " + conta1.verSaldo());
		
		//Metodo deposito
		if (conta1.deposito(50)) {
			System.out.println("Deposito efetuado com sucesso, novo saldo da conta: " + conta1.verSaldo());
		}

		//Metodo saque
		if (conta1.sacar(30)) {
			System.out.println("Saque efetuado com sucesso, novo saldo: " + conta1.verSaldo());
		}

	}
}