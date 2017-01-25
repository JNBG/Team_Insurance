/**
 *
 */
package search;
import customer.*;

import java.util.ArrayList;
import java.util.List;
import databasecontroller.DatabaseController;

public class Search {
    public Search() {
    }

    private CustomerPerson[] resultsCustomerPerson;
    private CustomerEnterprise[] resultsCustomerEnterprise;

    public CustomerPerson[] searchCustomer(String keyword){
        DatabaseController CustPersonDB = new DatabaseController();
        CustomerPerson[] checkPerson = CustPersonDB.searchCustomerPerson();
        int personSize = checkPerson.length;

        List<CustomerPerson> searchPersonResults = new ArrayList<CustomerPerson>();

        for (int arrayPos = 0; arrayPos <= personSize; arrayPos++) {
            if (checkPerson[arrayPos].name.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].lastName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].city.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].zip == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].streetName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            }  else if (checkPerson[arrayPos].houseNumber == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].customerClass.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].consultant == Integer.parseInt(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            }
            resultsCustomerPerson = searchPersonResults.toArray(resultsCustomerPerson);
        }


        CustomerEnterprise[] checkEnterprise = CustPersonDB.searchCustomerEnterprise();
        int entSize = checkEnterprise.length;

        List<CustomerEnterprise> searchEnterpriseResults = new ArrayList<CustomerEnterprise>();

        for (int arrayPos = 0; arrayPos <= entSize; arrayPos++) {
            if (checkEnterprise[arrayPos].enterpriseName.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].typeOfEnterprise.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].city.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].zip == Integer.parseInt(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].streetName.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            }  else if (checkEnterprise[arrayPos].houseNumber == Integer.parseInt(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].customerClass.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].consultant == Integer.parseInt(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            }
            resultsCustomerEnterprise = searchEnterpriseResults.toArray(resultsCustomerEnterprise);
        }

        return null;
    }

    public CustomerPerson[] getResultsCustomerPerson() {
        return resultsCustomerPerson;
    }

    public CustomerEnterprise[] getResultsCustomerEnterprise() {
        return resultsCustomerEnterprise;
    }
}
