package employee;

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
    public String status;
    public String role;
    public String agency;
    public int empID;
    //TODO: private customer.CustomerPerson currCustPers
    //TODO: private customer.CustomerEnterprise currCustEnt

    //Methods
    //add customer.customer to employee
    //TODO: Needs customer.customer-Attributes from customer.customer Class
    public Boolean newCustomer (){
        return true;
    }

    //edit a customer.customer of an employee
    //TODO: create method
    public Boolean editCustomer (){
        return true;
    }

    //add new search.search for objects associated with employee.employee
    //TODO: create method
    public Boolean newSearch(){
        return true;
    }

    //Acquires corresponding customer.customer-Person of employee.employee
    //TODO: create method
    public Boolean GetCurrCustPerson (){
        return true;
    }

    //Acquires corresponding customer.customer-Enterprise of employee.employee
    //TODO: create method
    public Boolean GetCurrCustEnt (){
        return true;
    }
}
