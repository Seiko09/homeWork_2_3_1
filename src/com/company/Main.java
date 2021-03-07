package com.company;

public class Main {

    public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(20000);
		System.out.println("Баланс: " + bankAccount.getAmount());

		while(true) {
			try {
				System.out.println("Сняли: " + bankAccount.withDraw(6000));
			} catch (LimitException e) {
				e.printStackTrace();
				System.out.println("Сняли: " + bankAccount.getAmount());
				bankAccount.amount=0;
			}
			System.out.println("Баланс: " + bankAccount.getAmount());
			if(bankAccount.getAmount() == 0){
	break;}
		}
    }
}
