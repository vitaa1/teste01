package application;

import java.util.Locale;
import java.util.Scanner;

import util.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria contabancaria;
		
		System.out.print("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome da pessoa da conta: ");
		String pessoa = sc.nextLine();
		System.out.print("Vc quer fazer um deposito inicial? (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Digite o valor inicial do deposito: ");
			double valorInicial = sc.nextDouble();
			contabancaria = new ContaBancaria(numeroConta, pessoa, valorInicial);
		} else {
			contabancaria = new ContaBancaria(numeroConta, pessoa);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(contabancaria);
		System.out.println();
		
		System.out.print("Digite um valor a ser depositado: ");
		double deposito = sc.nextDouble();
		contabancaria.primeiroDeposito(deposito);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(contabancaria);
		
		System.out.println();
		System.out.print("Digite um valor a ser sacado: ");
		double saque = sc.nextDouble();
		contabancaria.saque(saque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(contabancaria);
		
		sc.close();

	}

}
