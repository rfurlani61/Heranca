package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class NewOtherProgram {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		list.add(new BusinessAccount(1001, "Joao", 1000.0, 500.0));
		list.add(new SavingsAccount(1002, "Maria", 2000.0, 0.01));
		list.add(new BusinessAccount(1003, "Jose", 1500.0, 700.0));
		list.add(new SavingsAccount(1004, "Gil", 1800.0, 0.01));
		double sum = 0.0;
		for (Account acc : list) {
			sum =+ acc.getBalance();
		}
		System.out.println("Balance of all accounts: " + sum);
		
		for (Account acc : list) {
			acc.deposit(5.00); 	
		}
		for (Account acc : list) {
			System.out.println("Balance " + acc.getHolder() + ": " + acc.getBalance());
		}
	}
}