/**
 *
 */
package customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerEnterprise extends Customer {
    public CustomerEnterprise() {
    }

    public CustomerEnterprise (String cEnterpriseName, String cFoundingDate, double cAnnualRevenue, int cEmployeeCount, String cTypeOfEnterprise, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType, int empID){
        super(cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, empID);
        this.enterpriseName = cEnterpriseName;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.foundingDate = formatter.parse(cFoundingDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.annualRevenue = cAnnualRevenue;
        this.employeeCount = cEmployeeCount;
        this.typeOfEnterprise = cTypeOfEnterprise;

    }

    public String enterpriseName;
    public Date foundingDate;
    public double annualRevenue;
    public int employeeCount;
    public String typeOfEnterprise;
}
