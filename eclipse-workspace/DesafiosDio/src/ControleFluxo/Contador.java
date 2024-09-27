package ControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {

			System.out.println("O segundo parâmetro deve ser maior que o primeiro !!");
		}

		terminal.close();

	}

	private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		System.out.println("Tivemos uma quantidade de " + contagem + " interações.");
		System.out.println("");

		for (int interacoes = 1; interacoes <= contagem; interacoes++)
			System.out.println("Imprimindo a " + interacoes + "° interação.");

	}
}