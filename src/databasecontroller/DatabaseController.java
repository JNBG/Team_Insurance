package databasecontroller;

import java.util.Objects;
import employee.Employee;
import damage.Damage;

import customer.CustomerPerson;
import customer.CustomerEnterprise;
import document.Document;


/**
 * Created by Philipp on 04.01.2017.
 */
public class DatabaseController {
    public DatabaseController() {
    }


    private Employee resultEmployee;
    private CustomerPerson[] resultsCustomerPerson;
    private CustomerEnterprise[] resultsCustomerEnterprise;
    private Objects[] resultsInsurance;
    private Document[] resultsDocument;
    private Damage[] resultsDamage;

    public String searchLogin(String username){
        // TODO try catch (get password from DB)
        // Search in DB for username and return password if user is found else Error
        String password = "whatevs";
        return password;
    }

    public Employee searchEmployee(String username){
        // TODO try catch (get employee with 'username' from DB)
        // Search in DB for Employee with name 'username'
        Employee searchedEmployee = new Employee();
        return searchedEmployee;
    }

    public CustomerPerson[] searchCustomerPerson(){
        return null;
    }

    public CustomerEnterprise[] searchCustomerEnterprise(){
        return null;
    }

    public Objects[] searchInsurance(){
        return null;
    }

    public Document[] searchDokument(){
        return null;
    }

    public Damage[] searchDamage(){
        return null;
    }

}
