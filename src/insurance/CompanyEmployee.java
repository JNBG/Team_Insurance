/**
 *  Subclass to specify an Company Employee
 *  is used by CompanyPensionScheme to administrate all employees of the enterprise
 */
package insurance;


//Sub-subclass for list of employees of external Companies
public class CompanyEmployee{
    public CompanyEmployee() {
    }

    public CompanyEmployee(String exName, String exLastName, int exEmpID, int exRetirementBenefit) {
        this.name = exName;
        this.lastName = exLastName;
        this.empID = exEmpID;
        this.retirementBenefit = exRetirementBenefit;
    }

    //Attributes
    public String name;
    public String lastName;
    public int empID;
    public int retirementBenefit;
}
