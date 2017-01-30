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

    public void searchCustomer(String keyword){
        DatabaseController CustPersonDB = new DatabaseController();
        CustomerPerson[] checkPerson = CustPersonDB.searchCustomerPerson();
        int personSize = checkPerson.length;

        List<CustomerPerson> searchPersonResults = new ArrayList<CustomerPerson>();

        for (int arrayPos = 0; arrayPos < personSize; arrayPos++) {
            if (checkPerson[arrayPos].name.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].lastName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].city.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (String.valueOf(checkPerson[arrayPos].zip).equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].streetName.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            }  else if (String.valueOf(checkPerson[arrayPos].houseNumber).equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (checkPerson[arrayPos].customerClass.equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else if (String.valueOf(checkPerson[arrayPos].consultant).equals(keyword)) {
                searchPersonResults.add(checkPerson[arrayPos]);
            } else{

            }
        }
        resultsCustomerPerson = new CustomerPerson[searchPersonResults.size()];
        resultsCustomerPerson = searchPersonResults.toArray(resultsCustomerPerson);

        CustomerEnterprise[] checkEnterprise = CustPersonDB.searchCustomerEnterprise();
        int entSize = checkEnterprise.length;

        List<CustomerEnterprise> searchEnterpriseResults = new ArrayList<CustomerEnterprise>();

        for (int arrayPos = 0; arrayPos < entSize; arrayPos++) {
            if (checkEnterprise[arrayPos].enterpriseName.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].typeOfEnterprise.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].city.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (String.valueOf(checkEnterprise[arrayPos].zip).equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].streetName.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            }  else if (String.valueOf(checkEnterprise[arrayPos].houseNumber).equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (checkEnterprise[arrayPos].customerClass.equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else if (String.valueOf(checkEnterprise[arrayPos].consultant).equals(keyword)) {
                searchEnterpriseResults.add(checkEnterprise[arrayPos]);
            } else{

            }
        }
        resultsCustomerEnterprise = new CustomerEnterprise[searchEnterpriseResults.size()];
        resultsCustomerEnterprise = searchEnterpriseResults.toArray(resultsCustomerEnterprise);
    }

    public CustomerPerson[] getResultsCustomerPerson() {
        return resultsCustomerPerson;
    }

    public CustomerEnterprise[] getResultsCustomerEnterprise() {
        return resultsCustomerEnterprise;
    }
}
