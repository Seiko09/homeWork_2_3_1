package com.company;

public class BankAccount {
    double amount;

    public BankAccount() {}
    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double withDraw(int sum) throws LimitException {
        if(amount < sum){
            throw new LimitException("Вы просите больше чем сумма на вашем балансе!", amount);
        }
        else {amount -= sum;}
        return sum;
    }
    public void deposit(double sum)
    {
        this.amount += sum;
    }
    public double getAmount() {
        return amount;
    }
}
