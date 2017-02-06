/**
 * Subclass to specify the Company Pension Scheme
 * it contains an array of the employees of the Enterprise
 */
package insurance;


//Subclass wit list of employees for Company Pension Scheme
public class CompanyPensionScheme extends Insurance {
    public CompanyPensionScheme() {
    }

    public CompanyPensionScheme(CompanyEmployee[] iEmployee, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.employee = iEmployee;
    }

    //Attributes
    public CompanyEmployee[] employee;
}
