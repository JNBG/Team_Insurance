/**
 *  Subclass to specify the Healthinsurance
 *  currently only contains the cooperation partner who provides the Healthinsurance
 */
package insurance;


//Subclass for Health-insurance
public class HealthInsurance extends Insurance {
    public HealthInsurance() {
    }

    public HealthInsurance(String iPartner, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.partner = iPartner;
    }


    //Attributes
    public String partner;
}
