/**
 *
 */
package insurance;


//Subclass for Health-insurance
public class HealthInsurance extends Insurance {
    public HealthInsurance() {
    }

    public HealthInsurance(String iPartner, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContactID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContactID);
        this.partner = iPartner;
    }


    //Attributes
    public String partner;
}
