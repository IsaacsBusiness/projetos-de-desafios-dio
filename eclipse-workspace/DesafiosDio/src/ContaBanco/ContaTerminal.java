package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		// -------------Regras de declaração de variáveis----------------
		// --------------------------------------------------------------
		// ------int numeroConta = "1021"--------------------------------
		// ------String agencia = "067-8"--------------------------------
		// ------String nomeCliente, sobrenomeCliente = "Isaac Costa"----
		// ------double saque = "237.48"---------------------------------
		// --------------------------------------------------------------
		// ---------Saldo inicial da sua conta é de R$ 500,00.-----------

		String nomeCliente = "", sobrenomeCliente = "", agencia = "", respostaSaque = "";
		int numeroConta = 0;
		double saque, saldo = 500, saldoAtual = 0;

		// Interação com usuário.

		System.out.println("Olá, Bem Vindo ao seu banco 24hrs !");
		System.out.println("");

		// Método do objeto leia que permite receber dados do usuário.

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu nome e sobrenome: ");
		nomeCliente = leia.next();
		sobrenomeCliente = leia.next();

		System.out.println("");
		System.out.println("Digite o número de sua agência: ");
		agencia = leia.next();

		System.out.println("");
		System.out.println("Digite o número da sua conta: ");
		numeroConta = leia.nextInt();

		System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ",");
		System.out.println("Obrigado por está utilizando nosso banco, sua agência é " + agencia + ",");
		System.out
				.println("conta " + numeroConta + " e seu saldo de " + saldo + " reais já está disponível para saque.");

		System.out.println("");
		System.out.println("Deseja fazer algum saque ?");
		System.out.println("Digite 'qualquer tecla' para continuar ou 'sair' para finalizar.");
		respostaSaque = leia.next();
		respostaSaque = respostaSaque.toLowerCase();

		// Controle de fluxo através dos camandos de estruturas condicionais e
		// de repetição.

		if (!respostaSaque.equals("sair")) {

			System.out.println("Qual valor você deseja sacar ?");
			saque = leia.nextDouble();

			while (saque > saldo) {

				System.out.println("Saldo insuficiente, valor maior que seu saldo atual. Digite outro valor.");
				saque = leia.nextDouble();
			}
			if (saque <= saldo) {
				saldoAtual = saldo - saque;

				System.out.println("Seu saldo atual é de " + saldoAtual + " reais.");
				System.out.println("");
				System.out.println("Deseja fazer outro saque ?");
				System.out.println("Digite 'qualquer tecla' para continuar ou 'sair' para finalizar.");
				respostaSaque = leia.next();
				respostaSaque = respostaSaque.toLowerCase();
			}
			if (!respostaSaque.equals("sair")) {

				System.out.println("Qual valor você deseja sacar ?");
				saque = leia.nextDouble();

				while (saque > saldoAtual) {

					System.out.println("Saldo insuficiente, valor maior que seu saldo atual. Digite outro valor");
					System.out.println("ou digite '0' para finalizar.");
					saque = leia.nextDouble();

				}
				if (saque <= saldoAtual) {
					saldoAtual = saldoAtual - saque;

					System.out.println("Seu saldo atual é de " + saldoAtual + " reais.");

				}
			}
		}

		System.out.println("");
		System.out.println("Obrigado pela preferência e confiança em nossos serviços !!");

		// Programa finalizado.
		// --------------------------------------------------------------------------
		// Estou apenas começando não sou nenhum profissional, ainda kkkk
		// Espero que gostem do meu programa, foi o mais complicado que fiz até o
		// momento, fiquei o dia inteiro pra corrigir erros e conflitos que geravam.
		// Mais adorei me desafiar um pouco, gostando muito do bootcamp que estou
		// fazendo com vocês. Está valendo cada hora de estudo. :)

	}

}