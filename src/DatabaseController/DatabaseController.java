package databasecontroller;

import customer.CustomerPerson;
import customer.CustomerEnterprise;
import document.Document;
import insurance.Insurance;


/**
 * Created by Philipp on 04.01.2017.
 */
public class DatabaseController {
    public DatabaseController() {
    }

    private Login resultLogin;
    private Employee resultEmployee;
    private CustomerPerson[] resultsCustomerPerson;
    private CustomerEnterprise[] resultsCustomerEnterprise;
    private Insurance[] resultsInsurance;
    private Document[] resultsDocument;
    private Damage[] resultsDamage;

    public boolean searchLogin(){
        return true;
    }

    public Employee searchEmployee(){

    }

    public Customer[] searchCustomer(){

    }

    public Insurance[] searchInsurance(){

    }

    public Document[] searchDokument(){

    }

    public Damage[] searchDamage(){

    }

}
