/**
 *
 */
package customer;

import java.util.Objects;
import document.Document;


abstract class Customer {
    public Customer() {
    }

    public Customer(String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType, int empID){
        this.city = cCity;
        this.zip = cZip;
        this.streetName = cStreetName;
        this.houseNumber = cHouseNumber;
        this.communication = cCommunication;
        this.customerClass = cCustomerClass;
        this.customerType = cCustomerType;
        this.consultant = empID;
    }

    public String city;
    public int zip;
    public String streetName;
    public int houseNumber;
    public String communication;            // ways to contact a customer.customer
    public String customerClass;            // v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
    public String customerType;             // VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
    public int consultant;                  // empID of employee responsible for the customer

    // TODO customer.customer.attributes
    protected Document listedDocuments[];
    protected Objects insuranceList[];



    // METHODS:
    // PUBLIC:

    public Boolean newInsurance(){
        return true;
    }

    public void editInsurance(){

    }

    public Boolean newDocument(){
        return true;
    }

    public void editDocument(){

    }

    public Objects[] getInsuranceList() {
        return insuranceList;
    }

    public Document[] getListedDocuments() {
        return listedDocuments;
    }
}
