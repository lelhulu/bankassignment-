/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 * This class will set and create the account will give you a account number also has deposit and withdraw method 
 * @author lythe
 */
public class Account {

    private double balance = 0;
    private int accountNum;
    private static int numOfAcc = 500;

    /**
     * Creates a account number
     *
     * @param balance
     */
    public Account(double balance) {
        accountNum = numOfAcc++;
        this.balance = balance;
    }

    /**
     * Gets the balance
     *
     * @return double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets the account number
     *
     * @return int
     */
    public int getAccountNum() {
        return accountNum;
    }

    /**
     * Withdraw amount
     *
     * @param amount
     */
    public void withDraw(double amount) {

        if (amount > balance) {
            System.out.println("Not enough money in account");
        } else {
            balance = balance - amount;
            System.out.println("Success");
        }

    }

    /**
     * Deposit money into account
     *
     * @param amount
     */
    public void deposit(double amount) {

        if (amount < 0) {
            System.out.println("Incorrect deposit");
        } else {
            balance = balance + amount;
            System.out.println("Success");
        }

    }

    /**
     * prints account number and balance
     *
     * @return string
     */
    @Override
    public String toString() {

        return " Account number " + accountNum + "\n Balance: " + balance;
    }

}
