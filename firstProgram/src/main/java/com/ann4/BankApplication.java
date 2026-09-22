package com.ann4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("canara")
@PropertySource("classpath:com/ann4/application.properties")
public class BankApplication {
	@Value("${accountHolderName}")
	private String accountHolderName;
	@Value("${accountNumber}")
	private double accountNumber;
	@Value("${balance}")
	private double balance;

	public void deposit(double amount) {
		int count = 3;
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited successfully!");
		} else {
			count--;
			System.out.println("Please try again later");
			System.out.println("you have only " + count + " transactions left today.");
		}
	}

	public void withdraw(double amount) {
		if (balance > 0 && balance >= amount) {
			this.balance -= amount;
			System.out.println("Amount deducted!");
		} else {
			System.out.println("Please try again later");
		}
	}

	public double showBalance() {
		return balance;
	}

	public String showDetails() {
		return this.toString();
	}
}
