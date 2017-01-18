/**
 *  Used to log in an Employee
 */

package login;

import employee.Employee;
import databasecontroller.DatabaseController;

public class Login {

    private Boolean isLoggedIn = false;
    private String username;
    private String password;

    // TODO login.login.LogoutTimer: private int logoutTimer
    private Employee currEmployee;



    public Login() {
    }
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }



    /**
     * Used to login an Employee
     * returns true if this.password matches the password given by the DatabaseController. Else returns false
     * */
    public Boolean login(){
        DatabaseController dBConLogin = new DatabaseController();
        String returnedPassword = dBConLogin.searchLogin(this.username);

        if(returnedPassword.equals(this.password)){
            // change status to logged in
            this.isLoggedIn = true;

            //true: get employee with username
            this.currEmployee = dBConLogin.searchEmployee(this.username);
            return true;
        } else {
            //false: echo wrong password or throw exception
            System.out.println("wrong password, try again");
            return false;
        }
    }

    public Boolean getIsLoggedIn(){
        return isLoggedIn;
    }

    /**
     * Logs out the current Employee
     * returns void
     * makes this instance useless
     */
    public void logout(){
        this.isLoggedIn = false;
        this.username = null;
        this.password = null;
        this.currEmployee = null;
    }


    //TODO Login.AutoLogout()

    /**
     * Logs out the current Employee after n Minutes of Idletime
     */
    private void autoLogout(){

    }

}
