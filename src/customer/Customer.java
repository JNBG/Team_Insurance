/**
 *
 */
package customer;

import java.util.Objects;
import document.Document;
import insurance.*;


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
    public BuildingInsurance currBI;
    public CarInsurance currCI;
    public CompanyPensionScheme currCPS;
    public EquipmentInsurance currEI;
    public FleetInsurance currFI;
    public GroupAccidentInsurance currGAI;
    public HealthInsurance currHI;

    // TODO customer.customer.attributes
    protected Document listedDocuments[];
    protected Objects insuranceList[];



    // METHODS:
    // PUBLIC:

     /**
      * PARAMETERS USED BY ALL INSURANCES
      * @param iCustomerType Type of the Customer - Person/Enterprise
      * @param iInsuranceType Type of the Insurance - Matter/Life
      * @param iName Name of the Insurance
      * @param iActive is the current Insurance active?
      * @param iStartDate Date of the commencement of the Insurance in format 'dd.mm.yyyy'
      * @param iEndDate Date the Insurance ran/runs out in format 'dd.mm.yyyy'
      * @param iCurrentBalance Total Balance of Paid for and used Services in €
      * @param iContractID Unique Contract ID
      * @return true if creation was successful
      */


    /**
     * BUILDING INSURANCE PARAMETERS
     * @param iCity City of the insured Building
     * @param iZip ZIP-Code of the City
     * @param iStreetName Street-Address of the Building
     * @param iHouseNumber House-Number of the Building
     * @param iScope Additional Buildings of the main Building like a Garage, Garden, etc.
     * @param iValue Total Value of the Building
     * @param iRiskValue RiskValue, meaning a rough chance of the building receiving damages
     */
    public Boolean newBuildingInsurance(String iCity, int iZip, String iStreetName, int iHouseNumber, String iScope, Float iValue, String iRiskValue, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        BuildingInsurance newBI = new BuildingInsurance(iCity, iZip, iStreetName, iHouseNumber, iScope, iValue, iRiskValue, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currBI = newBI;
        this.currCI = null;
        this.currCPS = null;
        this.currEI = null;
        this.currFI = null;
        this.currGAI = null;
        this.currHI  = null;
        return true;
    }

    /**
     * CAR INSURANCE PARAMETERS
     * @param iLicensePlate Licens Plate of registered Vehicle in format 'AB-CD-00'
     * @param iBrand Brand of the Vehicle - e.g.: 'Ford','Mercedes',...
     * @param iModel Vehicle-Model - e.g.: 'Fiesta', 'C3',...
     * @param iBuildYear Year of Manufactura in format 'yyyy'
     * @param iMileage Total Mileage of the car in km
     * @param iEstMileage Estimated Annual Mileage of the car in km
     * @param iTuev last date of TÜV-Inspection in forma 'dd.mm.yyyy'
     * @param iRegisteredDrivers List of all registered Drivers
     */
    public Boolean newCarInsurance(String iLicensePlate, String iBrand, String iModel, int iBuildYear, int iMileage, int iEstMileage, String iTuev, String[] iRegisteredDrivers, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        CarInsurance newCI = new CarInsurance(iLicensePlate, iBrand, iModel, iBuildYear, iMileage, iEstMileage, iTuev, iRegisteredDrivers, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currCI = newCI;
        this.currBI = null;
        this.currCPS = null;
        this.currEI = null;
        this.currFI = null;
        this.currGAI = null;
        this.currHI  = null;
        return true;
    }

    /**
     * COMPANY PENSION SCHEME PARAMETERS
     * @param iEmployee List of all Employees in the Scheme
     */
    public Boolean newCompanyPensionScheme(CompanyEmployee[] iEmployee, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
       CompanyPensionScheme newCPS = new CompanyPensionScheme(iEmployee, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
       this.currCPS = newCPS;
       this.currCI = null;
       this.currBI = null;
       this.currEI = null;
       this.currFI = null;
       this.currGAI = null;
       this.currHI  = null;
       return true;
    }

    /**
     * EQUIPMENT INSURANCE PARAMETERS
     * @param iEquipmentList List of all the insured Equipment
     */
    public Boolean newEquipmentInsurance(Equipment[] iEquipmentList, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        EquipmentInsurance newEI = new EquipmentInsurance(iEquipmentList, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currEI = newEI;
        this.currCPS = null;
        this.currCI = null;
        this.currBI = null;
        this.currFI = null;
        this.currGAI = null;
        this.currHI  = null;
        return true;
    }

    /**
     * FLEET INSURANCE PARAMETERS
     * @param iCarCount Amount of insured Cars in the Fleet
     * @param iData All needed Data of the Cars (see CarInsurance)
     */
    public Boolean newFleetInsurance(int iCarCount, CarInsurance[] iData, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        FleetInsurance newFI = new FleetInsurance(iCarCount, iData, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currFI = newFI;
        this.currBI = null;
        this.currCI = null;
        this.currCPS = null;
        this.currEI = null;
        this.currGAI = null;
        this.currHI  = null;
        return true;
    }

    /**
     * GROUP ACCIDENT INSURANCE PARAMETERS
     * @param iEmployeeList
     */
    public Boolean newGroupAccidentInsurance(CompanyEmployee[] iEmployeeList, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        GroupAccidentInsurance newGAI = new GroupAccidentInsurance(iEmployeeList, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currGAI = newGAI;
        this.currFI = null;
        this.currBI = null;
        this.currCI = null;
        this.currCPS = null;
        this.currEI = null;
        this.currHI  = null;
        return true;
    }

    /**
     *
     * @param iPartner Cooperation-Partner
     */
    public Boolean newHealthInsurance(String iPartner, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        HealthInsurance newHI = new HealthInsurance(iPartner, iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.currHI = newHI;
        this.currFI = null;
        this.currBI = null;
        this.currCI = null;
        this.currCPS = null;
        this.currEI = null;
        this.currGAI = null;
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
