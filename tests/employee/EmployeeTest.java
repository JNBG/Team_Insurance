package employee;

import customer.CustomerPerson;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void newCustomerPerson() throws Exception {
        Employee PersonTester = new Employee();
        assertTrue(PersonTester.newCustomerPerson("Alex", "Werauchimmer", "06.12.1974", "married", 8, "München", 98746, "Poststraße", 7, "Phone: 09874/45219", "v", "vn, vp, bz"));
        }

    @Test
    public void newCustomerEnterprise() throws Exception {
        Employee EnterpriseTester = new Employee();
        assertTrue(EnterpriseTester.newCustomerEnterprise("Microsoft","01.02.1970", 245011288.0, 876442, "IT", 9, "Mountain View", 87962, "California Street", 45, "Phone: 87965/454213", "p", "vn, vp, bz"));
    }

    @Test
    public void editCustomer() throws Exception {

    }

    @Test
    public void searchCustomer() throws Exception {
        Employee SearchTester = new Employee();
        assertNotNull(SearchTester.searchCustomer("Erfurt"));
    }

}