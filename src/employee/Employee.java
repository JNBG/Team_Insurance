/**
 *
 */
package employee;

import customer.CustomerPerson;
import customer.CustomerEnterprise;
import databasecontroller.DatabaseController;
import search.Search;



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
     * @param cCustomerID unique CustomerID
     * @param cCity city where currently registered
     * @param cZip zip of current city
     * @param cCommunication ways to contact the Customer
     * @param cCustomerClass v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
     * @param cCustomerType VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
     * @return bool if creation was successful
     */
    public Boolean newCustomerPerson (String cName, String cLastName, String cBirthday, String cRelationshipStatus, int cCustomerID, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        CustomerPerson newCP = new CustomerPerson(cName, cLastName, cBirthday, cRelationshipStatus, cCustomerID, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
        this.currCustPerson = newCP;
        this.currCustEnterprise = null;
        return true;
    }

    /**
     *
     * @param cEnterpriseName String: Name of the Enterprise
     * @param cFoundingDate String: Founding Date ('dd.mm.yyyy')
     * @param cAnnualRevenue double in €
     * @param cEmployeeCount Amount of working employees
     * @param cTypeOfEnterprise sector the enterprise is working in (e.g. IT, Properties, ...) TEST
     * @param cCustomerID unique CustomerID TEST
     * @param cCity city where currently registered
     * @param cZip zip of current city
     * @param cCommunication ways to contact the Customer
     * @param cCustomerClass v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
     * @param cCustomerType VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
     * @return bool if creation was successful
     */
    public Boolean newCustomerEnterprise (String cEnterpriseName, String cFoundingDate, double cAnnualRevenue, int cEmployeeCount, String cTypeOfEnterprise, int cCustomerID, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        CustomerEnterprise newCE = new CustomerEnterprise(cEnterpriseName, cFoundingDate, cAnnualRevenue, cEmployeeCount, cTypeOfEnterprise, cCustomerID, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
        this.currCustEnterprise = newCE;
        this.currCustPerson = null;
        return true;
    }

    /**
     *
     * @param cName
     * @param cLastName
     * @param cBirthday
     * @param cRelationshipStatus
     * @param cCity
     * @param cZip
     * @param cStreetName
     * @param cHouseNumber
     * @param cCommunication
     * @param cCustomerClass
     * @param cCustomerType
     * @return true if change was successful in the DB, false otherwise
     */
    // TODO: write Test
    public Boolean editCustomerPerson (String cName, String cLastName, String cBirthday, String cRelationshipStatus, int cCustomerID, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        if(currCustPerson != null && currCustEnterprise == null){
            DatabaseController changeCuDB = new DatabaseController();
            CustomerPerson changedCustomer = new CustomerPerson(cName, cLastName, cBirthday, cRelationshipStatus, cCustomerID, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
            if(changeCuDB.changeCustomerPerson(changedCustomer)){
                currCustPerson = changedCustomer;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     *
     * @param cEnterpriseName
     * @param cFoundingDate
     * @param cAnnualRevenue
     * @param cEmployeeCount
     * @param cTypeOfEnterprise
     * @param cCity
     * @param cZip
     * @param cStreetName
     * @param cHouseNumber
     * @param cCommunication
     * @param cCustomerClass
     * @param cCustomerType
     * @return true if change was successful in the DB, false otherwise
     */
    // TODO: write Test
    public Boolean editCustomerEnterprise (String cEnterpriseName, String cFoundingDate, double cAnnualRevenue, int cEmployeeCount, String cTypeOfEnterprise, int cCustomerID, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType){
        if(currCustEnterprise != null && currCustPerson == null){
            DatabaseController changeCuDB = new DatabaseController();
            CustomerEnterprise changedCustomer = new CustomerEnterprise(cEnterpriseName, cFoundingDate, cAnnualRevenue, cEmployeeCount, cTypeOfEnterprise, cCustomerID, cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, this.empID);
            if (changeCuDB.changeCustomerEnterprise(changedCustomer)){
                currCustEnterprise = changedCustomer;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    /**
     * Does new Search in Customers with given Keyword
     * @param keyword searchterm for matches in CustomerPersons and CustomerEnterprises
     * @return an Obj[] of resulted search
     */
    public Object[] searchCustomer(String keyword){
        boolean foundPerson = false;
        boolean foundEnterprise = false;


        Search searchCustomer = new Search();
        searchCustomer.searchCustomer(keyword);

        if (searchCustomer.getResultsCustomerPerson().length != 0){
            foundPerson = true;
        }
        if (searchCustomer.getResultsCustomerEnterprise().length != 0){
            foundEnterprise = true;
        }

        if (foundPerson == false && foundEnterprise == false){
            return new Object[]{null};
        } else {
            return new Object[]{searchCustomer.getResultsCustomerPerson(),searchCustomer.getResultsCustomerEnterprise()};
        }
    }

    /**
     *
     * @return the Person working on. null if no Person assigned
     */
    public CustomerPerson GetCurrCustPerson (){
        return currCustPerson;
    }

    /**
     *
     * @return the Enterprise working on. null if no Enterprise assigned
     */
    public CustomerEnterprise GetCurrCustEnt (){
        return currCustEnterprise;
    }
}
