/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A180187
 */
public class bankEmployee extends Employee {
    
    private String bankName;
    
    public bankEmployee(){
        
    }
    
    public bankEmployee(String name, int employeeType, int age, int salary, String bankName){
        super(name, employeeType,age,salary);
        this.bankName = bankName;
    }
    
    

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    @Override
    public String toString(){
        return "Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary + " , Bank: " + bankName;
    }

    
    
    /**
     *
     */
    @Override
    public void displayEmployee(){
        System.out.println("Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary + " , Bank: " + bankName);
    }
}
