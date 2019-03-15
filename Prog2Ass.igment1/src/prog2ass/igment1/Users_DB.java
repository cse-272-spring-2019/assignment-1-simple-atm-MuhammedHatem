/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2ass.igment1;
import javax.swing.*;

/**
 *
 * @author Nayera Hatem
 */
public class Users_DB 
{
    private String Users_Pass ;
    //to create a new user using the constructor 

    public Users_DB(String Users_Pass)
    {
        this.Users_Pass = Users_Pass;
    }

    
    
    public String getUsers_Pass() 
    {
        return Users_Pass;
    }
       
}
