/**
 *
 */
package customer;

import java.util.Objects;
import employee.Employee;
import document.Document;
import insurance.BuildingInsurance;
import insurance.CarInsurance;
import insurance.CompanyPensionScheme;
import insurance.EquipmentInsurance;
import insurance.FleetInsurance;
import insurance.GroupAccidentInsurance;
import insurance.HealthInsurance;


abstract class Customer {
    public Customer() {
    }

    public String city;
    public int zip;
    public String streetName;
    public int houseNumber;
    public String communication;            // ways to contact a customer.customer
    public String customerClass;            // v=vip, a=better/profit>3500, b=normal/profit>1000, p=potential customer, z=not worthy
    public String customerType;             // VN=Versicherungsnehmer, VP=versicherte Person, BZ=Beitragszahler
    public Employee consultant;             // employee.employee responsible for the customer.customer

    // TODO customer.customer.attributes
    protected Document listedDocuments[];
    protected Objects insurenceList[];



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

    public Objects[] getInsurenceList() {
        return insurenceList;
    }

    public Document[] getListedDocuments() {
        return listedDocuments;
    }
}
