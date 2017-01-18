package login;

import employee.Employee;
import databasecontroller.DatabaseController;
/**
 * Created by Philipp on 04.01.2017.
 */
public class Login {

    private Boolean isLoggedIn = false;
    private String username;
    private String password;

    // TODO login.login.LogoutTimer: private int logoutTimer
    private Employee currEmployee;



    // CONSTRUCTOR
    public Login() {
    }
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }



    // METHODS:
    // PUBLIC:

    // used to login an employee.employee, gets username and password and checks the login
    public Boolean login(){
        DatabaseController dBConLogin = new DatabaseController();
        String returnedPassword = dBConLogin.searchLogin(this.username);

        if(returnedPassword.equals(this.password)){
            //true: get employee with username
            this.currEmployee = dBConLogin.searchEmployee(this.username);
            return true;
        } else {
            //false: echo wrong password or throw exception
            System.out.println("wrong password, try again");
            return false;
        }
    }

    //TODO login.login.logout()
    public Boolean logout(){
        return true;
    }



    // PRIVATE:

    //TODO login.login.checkLogin()
    //checks in Database if entered username and password are correct
    private Boolean checkLogin(){
        return true;
    }

    //TODO login.login.AutoLogout()
    private void autoLogout(){

    }

}
