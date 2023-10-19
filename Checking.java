/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 * This class creates the checking account
 * @author lythe
 */
public class Checking extends Account {

    
    /**
     * Constructor 
     * @param startBal 
     */
    public Checking(double startBal) {  // constructor
        super(startBal);

    }

    /**
     * Balance and account number is printed 
     * @return
     */
    @Override
    public String toString() {
        return "Account number : " + this.getAccountNum()
                + " Balance: " + this.getBalance();
    }

}
