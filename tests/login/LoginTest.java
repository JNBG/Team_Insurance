package login;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Philipp on 18.01.2017.
 */
public class LoginTest {
    @Test
    public void login() throws Exception {
        Login Max = new Login("Max", "whatevs");
        assertTrue(Max.login());
    }

}