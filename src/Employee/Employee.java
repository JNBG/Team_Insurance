package Employee;

import java.lang.reflect.Array;

/**
 * Created by Joscha on 04.01.2017.
 */
//List of all employed Persons
public class Employee {
    //Constructor
    public Employee() {
    }

    //Attributes
    public String name;
    public String lastName;
    public String status:
    public String role;
    public String agency;
    public int empID;
    //TODO: private Customer.CustomerPerson currCustPers
    //TODO: private Customer.CustomerEnterprise currCustEnt

    //Methods
    //add Customer.Customer to employee
    //TODO: Needs Customer.Customer-Attributes from Customer.Customer Class
    public Boolean newCustomer (){
        return true;
    }

    //edit a Customer.Customer of an employee
    //TODO: create method
    public Boolean editCustomer (){
        return true;
    }

    //add new Search.Search for objects associated with Employee.Employee
    //TODO: create method
    public Boolean newSearch(){
        return true;
    }

    //Acquires corresponding Customer.Customer-Person of Employee.Employee
    //TODO: create method
    public Boolean GetCurrCustPerson (){
        return true;
    }

    //Acquires corresponding Customer.Customer-Enterprise of Employee.Employee
    //TODO: create method
    public Boolean GetCurrCustEnt (){
        return true;
    }
}
