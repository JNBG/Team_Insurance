/**
 *
 */
package insurance;


//Subclass for Groud Accident Insurances
public class GroupAccidentInsurance extends Insurance {
    public GroupAccidentInsurance() {
    }

    public GroupAccidentInsurance(CompanyEmployee[] iEmployeeList, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContactID) {
    super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContactID);
    this.employeeList = iEmployeeList;
    }

    //Attributes
    public CompanyEmployee[] employeeList;
}
