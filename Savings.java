/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 * This class creates the savings account
 * @author lythe
 */
public class Savings extends Account {
/**
 * Constructor
 * @param balance 
 */
    public Savings(double balance) {
        super(balance);
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Account number : " + this.getAccountNum()
                + " Balance: " + this.getBalance();
    }
}
