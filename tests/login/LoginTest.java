package login;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    @Test
    public void loginSuccess() throws Exception {
        Login Max = new Login("Max", "whatevs");
        assertTrue(Max.login());
    }

    @Test
    public void loginFail() throws Exception {
        Login Paul = new Login( "Paul", "incorrect Password");
        assertFalse(Paul.login());
    }

    /* ###ZU TRIVIAL?###
    @Test
    public void loginCheck() throws Exception {
        Login Max = new Login("Max", "whatevs");
        Max.login();
        assertTrue(Max.getIsLoggedIn());
    }
    */

    @Test
    public void logout () throws Exception {
        Login Max = new Login("Max", "whatevs");
        Max.login();
        Max.logout();
        assertFalse(Max.getIsLoggedIn());
    }
}