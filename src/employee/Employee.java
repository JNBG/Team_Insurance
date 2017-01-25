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

    /**
     * Creates a new Customer with given information
     * @param cName Firstname of the new Customer
     * @param cLastName Lastname of the new Customer
     * @param cBirthday Birthday in format 'dd.mm.yyyy'
     * @param cRelationshipStatus married, single,...
     * @param cCity city where currently registered
     * @param cZip zip of current city
     * @param cCommunication ways to contact the Customer
     * @param cCustomerClass v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
     * @param cCustomerType VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
     * @return bool if creation was successful
     */
    public Boolean newCustomerPerson (String cName, String cLastName, String cBirthday, String cRelationshipStatus, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        CustomerPerson newCP = new CustomerPerson(cName, cLastName, cBirthday, cRelationshipStatus, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
        this.currCustPerson = newCP;
        this.currCustEnterprise = null;
        return true;
    }

    /**
     *
     * @param cEnterpriseName String: Name of the Enterprise
     * @param cFoundingDate String: Founding Date ('dd.mm.yyyy')
     * @param cAnnualRevenue double in €
     * @param cEmployeeCount int
     * @param cTypeOfEnterprise duno
     * @param cCity city where currently registered
     * @param cZip zip of current city
     * @param cCommunication ways to contact the Customer
     * @param cCustomerClass v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
     * @param cCustomerType VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
     * @return bool if creation was successful
     */
    public Boolean newCustomerEnterprise (String cEnterpriseName, String cFoundingDate, double cAnnualRevenue, int cEmployeeCount, String cTypeOfEnterprise, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        CustomerEnterprise newCE = new CustomerEnterprise(cEnterpriseName, cFoundingDate, cAnnualRevenue, cEmployeeCount, cTypeOfEnterprise, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
        this.currCustEnterprise = newCE;
        this.currCustPerson = null;
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
