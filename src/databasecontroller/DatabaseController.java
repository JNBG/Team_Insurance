/**
 *
 */
package databasecontroller;

import java.util.ArrayList;
import java.util.Objects;
import employee.Employee;
import damage.Damage;

import customer.CustomerPerson;
import customer.CustomerEnterprise;
import document.Document;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;


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

    public CustomerPerson[] searchCustomerPerson(String keyword){
        //TODO : Fill Dummys
        CustomerPerson Dummy1 = new CustomerPerson();
        CustomerPerson Dummy2 = new CustomerPerson();
        CustomerPerson Dummy3 = new CustomerPerson();

       CustomerPerson[] checkPerson = {Dummy1, Dummy2, Dummy3};

        int size = checkPerson.length;

        for (int arrayPos = 0; arrayPos <= size; arrayPos++){
            if(checkPerson[arrayPos].name.equals(keyword)){
                resultsCustomerPerson =
        }
        }
    return this.resultsCustomerPerson;
    }

    public CustomerEnterprise searchCustomerEnterprise(String keyword){
        CustomerEnterprise searchedEnterprise = new CustomerEnterprise();
        return searchedEnterprise;
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
