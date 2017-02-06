/**
 *  Subclass to specify a Groupaccidentinsurance
 *  uses CompanyEmployee to accumulate all employees covered by this insurance
 */
package insurance;


//Subclass for Groud Accident Insurances
public class GroupAccidentInsurance extends Insurance {
    public GroupAccidentInsurance() {
    }

    public GroupAccidentInsurance(CompanyEmployee[] iEmployeeList, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID) {
    super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
    this.employeeList = iEmployeeList;
    }

    //Attributes
    public CompanyEmployee[] employeeList;
}
