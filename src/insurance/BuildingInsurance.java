/**
 * Subclass to specify the Building insurance
 * contains all neccessary information for this Insurance
 */
package insurance;


//Subclass for Building-Insurances
public class BuildingInsurance extends Insurance{
    public BuildingInsurance() {
    }

    public BuildingInsurance (String iCity, int iZip, String iStreetName, int iHouseNumber, String iScope, Float iValue, String iRiskValue, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID){
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.city = iCity;
        this.zip = iZip;
        this.streetName = iStreetName;
        this.houseNumber = iHouseNumber;
        this.scope = iScope;
        this.value = iValue;
        this.riskValue = iRiskValue;
    }

    //Attributes
    public String city;
    public int zip;
    public String streetName;
    public int houseNumber;
    public String scope;        //Summary of all buildings additional to the building (Garage, Garden, etc.)
    public float value;
    public String riskValue;
}