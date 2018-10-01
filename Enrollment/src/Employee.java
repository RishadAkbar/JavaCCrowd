/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A180187
 */
public abstract class Employee implements IEmployee{
    
    
    String name;
    int employeeType;
    int salary;
    int age;
    boolean active = false;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the employeeType
     */
    public int getEmployeeType() {
        return employeeType;
    }

    /**
     * @param employeeType the employeeType to set
     */
    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     * @throws java.lang.Exception
     */
    public void setSalary(int salary) throws Exception {
        if (salary < 10000){
            throw new Exception("Salary too low");
        }
        else{
        if (salary > 100000){
            throw new Exception("Salary too high");
        }
                        
        /*-----------------------------------------------*/
        if (employeeType == MANAGER && salary < 20000){
            throw new Exception("Salary not enough");
        }
        else if (employeeType == DEVELOPER && salary > 30000){
            throw new Exception("Salary out of range");
        }
        else if (employeeType == EXEC && salary < 50000){
            throw new Exception("Salary not in range");
            
        }
        }
        
        this.salary = salary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public Employee(){
    
    }   


    public Employee(String name, int employeeType, int age, int salary ) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
        this.age = age;

    }
    @Override
    public void displayEmployee(){
        System.out.println("Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary);
    }
    
    @Override
    public void activateEmployee(){
        System.out.println(active = true);
    }
    

    @Override
    public void deactivateEmployee(){
        System.out.println(active = false);
    }
    
    @Override
    public String toString(){
        return "Employee Name: " + name + " , Job: " + employeeType + " , Age: " + age + " , Salary: " + salary;
    }
    
          
                
    }

