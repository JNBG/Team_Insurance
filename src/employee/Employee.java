/**
 *
 */
package employee;

import customer.CustomerPerson;
import customer.CustomerEnterprise;
import databasecontroller.DatabaseController;


//List of all employed Persons
public class Employee {
    public Employee() {
    }

    public Employee(String name, String lastName, String status, String role, String agency, int empID){
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.role = role;
        this.agency = agency;
        this.empID = empID;
    }

    public String name;
    public String lastName;
    public String status;
    public String role;
    public String agency;
    public int empID;
    public CustomerPerson currCustPerson;
    public CustomerEnterprise currCustEnterprise;
    public String keyword;

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
    public Boolean newSearch(String keyword){
        DatabaseController dBConEmp = new DatabaseController();
        dBConEmp.searchCustomerPerson(keyword);
        dBConEmp.searchCustomerEnterprise(keyword);

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
