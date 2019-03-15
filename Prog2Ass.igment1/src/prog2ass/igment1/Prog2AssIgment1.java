/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2ass.igment1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nayera Hatem
 */
public class Prog2AssIgment1
{
         public static int Checker(int x , int[] array)
         {
             int T = 1;
             int F = 0; 
             for(int i=0;i<array.length;i++)
             {
               if (x==array[i])
               {
                   return T ;
               }

             }
             return F ;
         }
         
         public static String Operation_type(double current_balance , double new_balance)
         {
             if (current_balance > new_balance)
             {
                 return "Withdrawal";
             }
             if (current_balance == new_balance&&new_balance!=0&&current_balance!=0)
             {
                 return " Balance Inquiry" ;
             }
             if (new_balance==0&&current_balance==0)
             {
                 return "Wrong Transaction";
             }
             
            return "Deposit";
         }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
             // TODO code application logic here
        //#1 creating users with their passwords
    int[] password_list = new int[5];
    Users_DB[] users = new Users_DB[5]; 
    for (int i=0; i<5;i++)
    {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    users[i] = new Users_DB(x);
    }
    for (int i=0;i<5;i++)
    {
     password_list[i] = users[i].getUsers_Pass();
    }
    
    
       //#2 making operations for a specefic user
    //operations op1 = new operations(users[0]);
    //op1.setDepositel(100);
    //double current_balance = op1.getBalance();
    //op1.setWithdraw(100);
    //double new_balance = op1.getBalance();
    //System.out.println(Operation_type(current_balance,new_balance));
    
    
            
    
      //#3 Storing the User`s Transactions
    //Transactions T = new Transactions(Operation_type(current_balance,new_balance),(Math.abs(new_balance-current_balance)),users[0]); 
    //System.out.println(T.getAmount());
    //System.out.println(T.getOperation_type());
    
    //hashmap and concatenate
    //for loop and i restars every 5 elemnts i%5 = 0
  
      
    
    

   
    }
}




    
