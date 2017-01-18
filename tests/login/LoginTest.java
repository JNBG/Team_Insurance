package login;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Philipp on 18.01.2017.
 */
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


}