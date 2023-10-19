/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class has a array list of accounts and will get the customers account
 *
 * @author lythe
 */
public class Customer extends Person {

    private ArrayList<Account> accounts;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     */
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        accounts = new ArrayList<>();
    }

    /**
     * gets all the customers accounts
     * @return Account
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * Sets the account
     *
     * @param account
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * opens the account with the starting balance
     *
     * @param id
     *
     */
   
    public Account getAccount(int id) {               // gets the account with an id 
        Account value = null;
        for (Account e : accounts) {
            if (e.getAccountNum() == id) {
                value = e;
            }
        }
        return value;
    }

    /**
     * Prints out first name and last name
     *
     * @return String
     */
    @Override
    public String toString() {
        return firstName
                + " " + lastName;
    }
/**
 * Method that gets the account and makes a deposit
 */
    public void deposit() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Which account would you like to deposit to: ");
        System.out.println(getAccounts());                 // prints out the accounts
        System.out.println("Enter account number:");
        int account = answer.nextInt();                    // takes the account number 
        System.out.println("How much do you want to deposit: ");
        int amount = answer.nextInt();   
        getAccount(account).deposit(amount);               // gets the account and makes the deposit 
    }
/**
 * Method that gets the account and makes a withdraw
 */
    public void withDraw() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Which account would you like to withdraw from: ");
        System.out.println(getAccounts());             // prints out the accounts 
        System.out.println("Enter account number:");
        int account = answer.nextInt();                // takes the account number 
        System.out.println("How much do you want to withdraw: ");
        int amount = answer.nextInt();
        getAccount(account).withDraw(amount);          // gets the account and makes the withdraw

    }
/**
 * Method that gets the account and shows the balance 
 */
    public void listBalance() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Which account would you like to show the balance from: ");
        System.out.println(getAccounts());               // prints out the accounts 
        System.out.println("Enter account number:");
        int account = answer.nextInt();                  // takes the account number 
        System.out.println("You have a balance of: " + getAccount(account).getBalance());  // prints out the balance of the account

    }

}
