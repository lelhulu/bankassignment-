/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.*;

/**
 * This class holds the customer and employee array list also finds the customer
 * when the code ask to input their id
 *
 * @author lythe
 */
public class Bank {

    ArrayList<Customer> customers;
    ArrayList<Employee> employees;

    private String name;

    /**
     * Constructor
     *
     * @param name
     */
    public Bank(String name) {                   // constructor 
        this.name = name;
        customers = new ArrayList<>();
        employees = new ArrayList<>();
    }

    /**
     * Gets the name
     *
     * @return String
     */
    public String getName() {                   // gets the name 
        return name;
    }

    /**
     * Adds customer to the array list
     *
     * @param customer
     */
    public void addCustomer(Customer customer) {  // adds customer to the array list
        customers.add(customer);

    }

    /**
     * This gets the customer
     *
     * @return Customer
     */
    public ArrayList<Customer> getCus() {         // gets the Customer

        return customers;
    }

    /**
     * Finds the customer with their id
     *
     * @param id
     * @return Customer
     */
    public Customer getCustomer(int id) {        // finds the customer in the array list
        Customer value = null;
        for (Customer e : customers) {
            if (e.getIdNum() == id) {
                value = e;
            }
        }
        return value;
    }
/**
 * This method will create the customer object 
 */
    public void makeCustomer() {
        Scanner answer = new Scanner(System.in);
        System.out.println("\n Lets add you in the system! \n");
        System.out.println("Enter firstname: ");
        String fn = answer.nextLine();
        System.out.println("Enter lastname: ");
        String ln = answer.nextLine();
        Customer customer = new Customer(fn, ln);
        addCustomer(customer);
        System.out.println("Your id number is " + customer.getIdNum());
        System.out.println("Do not forget your id will be needed to enter account \n");
    }
/**
 * This method creates the account and will ask if customer wants checking or saving
 * @return Account
 */
     public static Account createAccount() {              // method to create the checking or savings
        Scanner answer = new Scanner(System.in);
        System.out.println("What account would you like to open? (0- checking / 1 - savings)");
        int acc = answer.nextInt();
        answer.nextLine();
        Account account = null;

        switch (acc) {

            case 0:     // case 0 is for checking
                System.out.println("Enter starting balance: ");
                int amount = answer.nextInt();
                account = new Checking(amount);  // creates the checking
                System.out.println("Your account number : " + account.getAccountNum());  // gives you the account number 
                break;
            case 1:   // case 1 is for savings 
                System.out.println("Enter starting balance: ");
                amount = answer.nextInt();
                account = new Savings(amount);    // creates the savings 
                System.out.println("Your account number : " + account.getAccountNum());  // gives you the account number 
                break;

        }
        return account;   // return account

    }
     
     
   

}
