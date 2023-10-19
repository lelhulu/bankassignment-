/**
 * The five major functions are createAccount and make customer which are in bank class
 * The other three are in customer which are deposit, withdraw and list balance
 */
package start;

import java.util.Scanner;

/**
 * This code has the test harness and will run the code
 *
 * @author lythe
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean done = false;
        do {
            try {
                Scanner answer = new Scanner(System.in);
                Bank bank = new Bank("Lythe bank");

                System.out.println("\t ------------------------------------");
                System.out.println("\t /      Welcome to " + bank.getName() + "      /");
                System.out.println("\t ------------------------------------");
                System.out.println("");
                System.out.println("Are you new to the bank? (0-no/ 1-yes)");

                int an = answer.nextInt();
                answer.nextLine();

                while (an != 0) {
                    switch (an) {                                             // This switch is for either repeating customers or new customers 

                        case 0:
                            System.out.println("\n Welcome back \n");
                            break;
                        case 1:
                            bank.makeCustomer();
                            break;
                        default:
                            break;

                    }
                    System.out.println("Are you new to the bank? (0-no/ 1-yes)");
                    an = answer.nextInt();
                    answer.nextLine();

                }

                System.out.println("Enter id number to look up account: ");
                int id = answer.nextInt();
                System.out.println("Hello " + bank.getCustomer(id) + " what can we do for you?");    // prints out the name of customer 
                Customer customer = bank.getCustomer(id);

                displayMenu();

                int b = answer.nextInt();
                answer.nextLine();

                while (b != 0) {

                    switch (b) {
                        case 0:                              // exit the program 
                            System.out.println("Thank you!");
                            break;
                        case 1:                             // creates a account either savings or checking
                            customer.addAccount(bank.createAccount());
                            break;
                        case 2:                             // deposit into account
                            customer.deposit();
                            break;
                        case 3:                             // withdraw from account
                            customer.withDraw();
                            break;
                        case 4:                             // shows balance of account
                            customer.listBalance();
                            break;
                        case 5:                             // goes back home 
                            System.out.println("Enter id number to look up account: ");
                            id = answer.nextInt();
                            System.out.println("Hello " + bank.getCustomer(id) + " what can we do for you?");    // prints out the name of customer 
                            customer = bank.getCustomer(id);
                            break;
                        default:                            // default
                            System.out.println("Try again");
                            break;

                    }
                    displayMenu();
                    b = answer.nextInt();
                    answer.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Invaild");

            }

        } while (!done);
    }
    

    /**
     * Displays menu for the bank
     */
    public static void displayMenu() {       // static method to display the menu

        System.out.println("1. Make an Account");
        System.out.println("2. Make an deposit ");
        System.out.println("3. Make a withdraw");
        System.out.println("4. List balance");
        System.out.println("5. Home");
        System.out.println("0. Exit");
    }
}
