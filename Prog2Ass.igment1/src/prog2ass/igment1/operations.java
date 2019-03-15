/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2ass.igment1;

/**
 *
 * @author Nayera Hatem
 */
public class operations {
  private double withdraw;
  private double balance = 0;
  private double depositel;

    public operations(Users_DB user) 
    {
    }
  

    public double setWithdraw(double withdraw)
    {
        double x = 0;
        double y ;
        
        if (withdraw < 0)
        {
            //System.out.println("You Can Not Enter A Negative Number.");
            return x ;
        }
        
        else
        {
            this.withdraw = withdraw;
            
            if (withdraw > balance)
            {
                
                y = balance ;
                //System.out.println("You Can Only Withdraw Maximum :"+y);
                return x;
            }
          
            balance = balance - withdraw;
            return balance;
            
        }
    }

    public double setDepositel(double depositel)
    {
        double x = 0;
        if (depositel < 0)
        {
            //System.out.println("You Can Not Enter A Negative Number.");
            return x ;
        }
        else 
        {
        this.depositel = depositel;
        balance = balance + depositel ;
        return balance;
        }
    }
    
    

    public double getBalance() {
        return balance;
    }
    
  
    
}
