/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.ArrayList;

/**
 * This class is the super class of customer and employee and creates the customer id 
 * @author lythe
 */
public class Person {

    public String firstName;
    public String lastName;
    private int idNum;
    private static int numOfAcc = 700;
/**
 * Constructor
 * @param firstName
 * @param lastName 
 */
    public Person(String firstName, String lastName) {   // constructor
        this.firstName = firstName;
        this.lastName = lastName;
        idNum = numOfAcc++;

    }
/**
 * Gets the id number 
 * @return int
 */
    public int getIdNum() {       // gets the customer id
        return idNum;
    }

    /**
     * prints the id number 
     * @return String
     */
    @Override
    public String toString() {   // to string retruns the id 
        return "ID: " + idNum;
    }

}
