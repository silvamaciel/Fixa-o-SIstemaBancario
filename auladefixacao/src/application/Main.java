package application;

import java.util.Scanner;

import entities.BanckAccounts;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insert your account Number: ");
		String accountNumber = sc.nextLine();

		System.out.println("Insert your account Name: ");
		String accountName = sc.nextLine();

		System.out
				.println("Insert The value to deposit in your account, if you don't want to do iet, please insert 0: ");
		double accountBalance = sc.nextDouble();

		BanckAccounts banckAccounts;

		if (accountBalance > 0) {
			banckAccounts = new BanckAccounts(accountNumber, accountName, accountBalance);
		} else {
			banckAccounts = new BanckAccounts(accountNumber, accountName);
		}

		System.out.println(banckAccounts.toString());

		int choice;

		do {
			System.out.println(" 1 Para depositar | 2 para Sacar | 3 Para sair:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Insira o valor para depósito");
				banckAccounts.DepositAccount(sc.nextDouble());
				System.out.println("Update Account Balance");
				System.out.println(banckAccounts.toString());
				break;
			case 2:
				System.out.println("Insert the value to your bank withdrawal");
				banckAccounts.withdrawalAccount(sc.nextDouble());
				System.out.println("Update Account Balance");
				System.out.println(banckAccounts.toString());
				break;
			case 3: 
				System.out.println("Obrigado e volte Sempre !");
				break;
			default: System.out.println("Opção Invalida!");
			}

		} while (choice != 3);

	}

}
