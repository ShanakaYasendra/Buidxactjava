package StepsDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import page.*;
import util.base;

public class step extends base {


    public String getOsName()
    {
        return System.getProperty("os.name");

    }
    @Given("User Navigate to {string}")
    public void user_navigate_to(String url) {
        if(getOsName().startsWith("Windows"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
        }
        else
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver");
        }
        driver= new ChromeDriver();
        driver.navigate().to(url);

    }

    @When("User Enter username as {string} and Password as {string}")
    public void user_enter_username_as_and_password_as(String username, String password) {

        login = new LoginPage(driver);
        login.enterLoginDetails(username,password);


    }

    @When("click Login")
    public void click_login() {


        login.clickLogin();
    }



    @When("User Click Logout")
    public void user_click_logout() {
        menubar=new Menubar(driver);
        menubar.ClickProfile();
        menubar.LogOut();
    }



    @Then("Login page title should display as {string}")
    public void loginPageTitleShouldDisplayAs(String title) {
        assertEquals(login.getPageTitle(),title);
    }

    @Then("should display Dashboard title {string}")
    public void shouldDisplayDashboardTitle(String title) {
        home = new HomePage(driver);
        assertEquals(home.getpagetitle(),title);
    }




    @When("Click My Profile")
    public void click_my_profile() {
        menubar = new Menubar(driver);
        menubar.ClickProfile();
    }
    @When("Click Reset Password")
    public void click_reset_password() {
        menubar.ResetPassword();

    }

    @Then("Confirmation massage should display")
    public void confirmation_massage_should_display() {
        home.ClickConfirmation();

    }

    @And("user should able to click Logout")
    public void userShouldAbleToClickLogout() {
      
        menubar.LogOut();
    }

    @And("Open Password Reset request email")
    public void openPasswordResetRequestEmail() {
        emailPage= new EmailPage(driver);
        emailPage.ClickResetEmail();
        
    }

    @And("Click RESET")
    public void clickRESET() {
        emailPage= new EmailPage(driver);
        emailPage.ClickResetLink();
        
    }

    @Then("Fill Password Field should display")
    public void fillPasswordFieldShouldDisplay() {
        
    }

    @And("Confirm Password Field should display")
    public void confirmPasswordFieldShouldDisplay() {


    }

    @When("User Enter New Password as {string}")
    public void userEnterNewPasswordAs(String password) {
        resetPasswordPage= new ResetPasswordPage(driver);
        resetPasswordPage.EnterNewPassword(password);
    }

    @And("Confirm Password as {string}")
    public void confirmPasswordAs(String password) {
        resetPasswordPage.ConfirmPassword(password);
    }

    @And("click Confirm")
    public void clickConfirm() {
        resetPasswordPage.ClickConfirm();
    }

    @And("Close the browser")
    public void closeTheBrowser() {
        driver.close();
    }


    @Then("Error Message should display")
    public void errorMessageShouldDisplay() {
        assertTrue(login.getErrorMsg().isDisplayed());
    }
}
