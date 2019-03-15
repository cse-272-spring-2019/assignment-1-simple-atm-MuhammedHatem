/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2ass.igment1;

/**
 *
 * @author Mohammed Hatem © ® ž
 */

public class Transactions {
    private String operation_type;
    private double amount ;


    
    public Transactions(String operation_type, double amount , Users_DB user) 
    {
        this.operation_type = operation_type;
        this.amount = amount;
    }

    public double getAmount() 
    {
        return amount;
    }

    public String getOperation_type()
    {
        return operation_type;
    }
    
    
    
    
}
