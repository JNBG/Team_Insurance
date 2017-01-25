/**
 *
 */
package databasecontroller;

import java.util.ArrayList;
import java.util.List;
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

    public CustomerPerson[] searchCustomerPerson(String keyword) {
        CustomerPerson PersonDummy1 = new CustomerPerson("Max", "Mustermann", "01.01.1990", "single", "Erfurt", 9986, "Badstraße", 1, "12345/6789", "p", "vn, vp, bz", 1);
        CustomerPerson PersonDummy2 = new CustomerPerson("Monika", "Musterfrau", "20.01.1990", "married", "Berlin", 10115, "Turmstraße", 1, "10115/4321", "v", "vn, vp, bz", 2);
        CustomerPerson PersonDummy3 = new CustomerPerson("Hans", "Zimmer", "12.09.1957", "single", "Frankfurt am Main", 60308, "Elisenstraße", 28, "60308/4562", "p", "vn, vp, bz", 1);

        CustomerPerson[] checkPerson = {PersonDummy1, PersonDummy2, PersonDummy3};

        int personSize = checkPerson.length;

        List<CustomerPerson> searchPersonResults = new ArrayList<CustomerPerson>();

        for (int arrayPos = 0; arrayPos <= personSize; arrayPos++) {
            if (checkPerson[arrayPos].name.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].lastName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].birthdate.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].relationshipStatus.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].city.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].zip == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].streetName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            }  else if (checkPerson[arrayPos].houseNumber == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].communication.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].customerClass.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].customerType.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].consultant == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            }
            searchPersonResults.toArray(resultsCustomerPerson);
        }
            return this.resultsCustomerPerson;
    }

    public CustomerEnterprise searchCustomerEnterprise(String keyword){
        CustomerEnterprise EnterpriseDummy1 = new CustomerEnterprise();
        CustomerEnterprise EnterpriseDummy2 = new CustomerEnterprise();
        CustomerEnterprise EnterpriseDummy3 = new CustomerEnterprise();

        CustomerEnterprise[] checkEnterprise = {EnterpriseDummy1, EnterpriseDummy2, EnterpriseDummy3};

        int entSize = checkEnterprise.length;

        List<CustomerEnterprise> searchEnterpriseResults = new ArrayList<CustomerEnterprise>();

        for (int arrayPos = 0; arrayPos <= entSize; arrayPos++) {}
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
