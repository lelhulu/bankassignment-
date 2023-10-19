/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 * This class gets the position and salary of employee 
 * @author lythe
 */
public class Employee extends Person {

    private int salary;
    private String position;
    /**
     * Constructor
     * @param firstName
     * @param lastName 
     */
    public Employee(String firstName, String lastName) { //constructor
        super(firstName, lastName);
    }
/**
 * gets the salary
 * @return int
 */
    public int getSalary() {   // gets salary 
        return salary;
    }
/**
 * set the salary
 * @param salary 
 */
    public void setSalary(int salary) { // sets the salary 
        this.salary = salary;
    }
 /**
  * get the position
  * @return String
  */
    public String getPosition() {   // gets the position
        return position;
    }
/**
 * set the position
 * @param postion 
 */
    public void setPosition(String postion) {  // set the position
        this.position = postion;
    }
    
    

}
