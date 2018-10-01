/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A180187
 */
public interface IEmployee {
    
    public void displayEmployee();
    public void activateEmployee();
    public void deactivateEmployee();
            
    static final int MANAGER = 10;
    static final int DEVELOPER = 20;
    static final int EXEC = 30;
    
}
