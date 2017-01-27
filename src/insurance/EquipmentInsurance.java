/**
 *
 */
package insurance;


//Subclass for Equipment-Insurances
public class EquipmentInsurance extends Insurance{
    public EquipmentInsurance() {
    }

    public EquipmentInsurance(Equipment[] iEquipmentList, String iCustomerType, String iInsuranceType, String iName, Boolean iActive, String iStartDate, String iEndDate, Float iCurrentBalance, int iContractID) {
        super(iCustomerType, iInsuranceType, iName, iActive, iStartDate, iEndDate, iCurrentBalance, iContractID);
        this.equipmentList = iEquipmentList;
    }

    //Attributes
    public Equipment[] equipmentList;
}
