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
        // Search in DB for employee with name 'username'
        Employee searchedEmployee = new Employee();
        return searchedEmployee;
    }

    public CustomerPerson[] searchCustomerPerson() {
        CustomerPerson PersonDummy1 = new CustomerPerson("Max", "Mustermann", "01.01.1990", "single", "Erfurt", 99086, "Badstraße", 1, "12345/6789", "p", "vn, vp, bz", 1);
        CustomerPerson PersonDummy2 = new CustomerPerson("Monika", "Musterfrau", "20.01.1990", "married", "Berlin", 10115, "Turmstraße", 1, "10115/4321", "v", "vn, vp, bz", 2);
        CustomerPerson PersonDummy3 = new CustomerPerson("Hans", "Zimmer", "12.09.1957", "single", "Frankfurt am Main", 60308, "Chaussestraße", 28, "60308/4562", "p", "vn, vp, bz", 1);
        CustomerPerson PersonDummy4 = new CustomerPerson("Anakin","Skywalker", "31.01.102", "single again", "Mustafar Planet", 1, "Vaders Street", 1, "Force Choking", "v", "vn, vp, bz", 9);

        CustomerPerson[] checkPerson = {PersonDummy1, PersonDummy2, PersonDummy3, PersonDummy4};

        return checkPerson;
    }

    public CustomerEnterprise[] searchCustomerEnterprise(){
        CustomerEnterprise EnterpriseDummy1 = new CustomerEnterprise("Google", "04.09.1998", 15987654321987.0, 456328, "Inc.", "Mountain View", 94035, "Claifornia State Route", 85, "Das kann man ja einfach googlen", "v", "vn, vp, bz", 3);
        CustomerEnterprise EnterpriseDummy2 = new CustomerEnterprise("InsuranceTeam", "08.11.2016", 5, 2, "iV", "Erfurt", 99085, "Altonaer Straße", 25, "Phone:  0361/67000", "v", "vn, vp, bz", 2);
        CustomerEnterprise EnterpriseDummy3 = new CustomerEnterprise("MaxTech", "04.01.2015", 8745.31, 1, "ltd.", "Stockholm", 10012, "Djurgårdsbrunnsvägen", 10, "Email: MaxMustermann@swedenmail.se", "p", "vn, vp, bz", 4);

        CustomerEnterprise[] checkEnterprise = {EnterpriseDummy1, EnterpriseDummy2, EnterpriseDummy3};

        return checkEnterprise;
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



    // TODO: Implement database change
    public boolean changeCustomerEnterprise(CustomerEnterprise changedCustomer){
        // try catch, when db ist implemented
        // try (){
        // change Customer in DB
        return true;
        // } catch {
        // return false;
        // }
    }

    // TODO: Implement database change
    public boolean changeCustomerPerson(CustomerPerson changedCustomer){
        // try catch, when db ist implemented
        // try (){
        // change Customer in DB
        return true;
        // } catch {
        // return false;
        // }
    }

}
