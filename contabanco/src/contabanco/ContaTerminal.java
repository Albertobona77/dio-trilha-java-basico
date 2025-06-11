package contabanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Numero da sua conta: ");
		int conta = sc.nextInt();

		System.out.print("Digite o numero de sua agencia: ");
		String agencia = sc.next();

		System.out.print("Digete seu nome: ");
		String nomeCliente = sc.next();

		System.out.print("Digite o saldo: ");
		double saldo = sc.nextDouble();

		sc.close();

		System.out.println(
				"Olá " + nomeCliente.toString() + ", obrigado por criar uma conta em nosso banco, sua agência é "
						+ agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

	}

}
