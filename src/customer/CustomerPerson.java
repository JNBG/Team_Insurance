/**
 *
 * */
package customer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class CustomerPerson extends Customer {
    public CustomerPerson() {
    }

    public CustomerPerson(String cName, String cLastName, String cBirthday, String cRelationshipStatus, String cCity, int cZip, String cStreetName, int cHouseNumber, String cCommunication, String cCustomerClass, String cCustomerType, int empID) {
        super(cCity, cZip, cStreetName, cHouseNumber ,cCommunication, cCustomerClass, cCustomerType, empID);
        this.name = cName;
        this.lastName = cLastName;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            this.birthdate = formatter.parse(cBirthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.relationshipStatus = cRelationshipStatus;


    }

    public String name;
    public String lastName;
    public Date birthdate;
    public String relationshipStatus;
}
