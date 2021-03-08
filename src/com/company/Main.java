package com.company;

public class Main {

	public static void main(String[] args) throws LimitException {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(20000);
		System.out.println("Баланс: " + bankAccount.getAmount());
		System.out.println("-----------------------------------------------------");

		while(true) {
			try {
				int sum = 6000;
				System.out.println("Хотят снять: " + sum);
				System.out.println("Остаток: " + bankAccount.withDraw(sum));
				System.out.println("-----------------------------------------------------");
			} catch (LimitException e) {

				System.out.println("Вы можете снять сумму в размере: " + e.getRemainingAmount());
				int int_amount = (int) e.getRemainingAmount();

				System.out.println("Остаток: " + bankAccount.withDraw(int_amount));

				e.printStackTrace();
				//System.out.println("Остаток = " + bankAccount.getAmount());
				//System.out.println("Остаток = " + e.getRemainingAmount());
				//System.out.println("Сняли: " + bankAccount.withDraw(int_amount));
				//System.out.println("Сняли: " + bankAccount.getAmount());
				//System.out.println(e.getRemainingAmount());
				//e.printStackTrace();
				//bankAccount.withDraw();
				//bankAccount.amount=0;
			}
			if(bankAccount.getAmount() <= 0){
				break;}
		}
	}
}