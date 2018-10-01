/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A180187
 */
public class EnrollEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bankEmployee a = new bankEmployee("Bob", 10, 30, 30000, "Standard Bank SA");
        bankEmployee b = new bankEmployee("Jerry", 20, 20, 20000, "ABSA");
        bankEmployee c = new bankEmployee("Tom", 30, 40, 50000, "Nedbank");
        
        System.out.println("Activating Employees");
        a.activateEmployee();
        b.activateEmployee();
        c.activateEmployee();
        
        System.out.println("");
        System.out.println("Displaying Employee information");
        a.displayEmployee();
        b.displayEmployee();
        c.displayEmployee();
        
        System.out.println("");
        System.out.println("Deactivating Bob");
        a.deactivateEmployee();
        
        System.out.println("");
        System.out.println("Checking equality");
        bankEmployee newOne = a;
        if (newOne.equals(a)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
                
        }
        System.out.println("");
        System.out.println("Checking Salary ranges");
        try{
        a.setSalary(10000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
        b.setSalary(50000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
        c.setSalary(40000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
        c.setSalary(1000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }    
        
        try{
        b.setSalary(200000);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("");
        System.out.println("Printing Object");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(newOne);
    }
   
    
}
