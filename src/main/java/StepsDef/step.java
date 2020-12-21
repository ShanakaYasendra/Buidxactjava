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



    @Then("Fill Password Field should display")
    public void fillPasswordFieldShouldDisplay() {
        resetPasswordPage= new ResetPasswordPage(driver);
      assertTrue(resetPasswordPage.GetElement("pswd").isDisplayed());
    }

    @And("Confirm Password Field should display")
    public void confirmPasswordFieldShouldDisplay() {

        assertTrue(resetPasswordPage.GetElement("pswd-rpt").isDisplayed());
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

    @And("Click {string}")
    public void click(String linkText) {
        emailPage= new EmailPage(driver);
        emailPage.ClickLink(linkText);
    }

    @When("Click My Business")
    public void clickMyBusiness() {
        menubar= new Menubar(driver);
        menubar.ClickBusiness();
    }

    @And("Click Add Users")
    public void clickAddUsers() {
        menubar.clickUsers();
    }

    @When("user enter first name as {string}")
    public void userEnterFirstNameAs(String firstName) {
        createUserPage= new CreateUserPage(driver);
        createUserPage.EnterFirstName(firstName);
    }

    @And("last name as {string}")
    public void lastNameAs(String lastname) {
        createUserPage.EnterLastName(lastname);
    }

    @And("email as {string}")
    public void emailAs(String email) {
        createUserPage.EnterEmail(email);
    }

    @And("mobile number as {string}")
    public void mobileNumberAs(String mobile) {
        createUserPage.EnterMaobile(mobile);
    }



    @Then("User should click create")
    public void userShouldClickCreate() {
        createUserPage.ClickCreate();
    }

    @Then("New user form should display")
    public void newUserFormShouldDisplay() {
        assertTrue(createUserPage.GetFirstName().isDisplayed());
    }

    @And("Click + button")
    public void clickButton() {
        createUserPage= new CreateUserPage(driver);
        createUserPage.ClickAdd();
    }

    @And("Open Activate email")
    public void openActivateEmail() {

        emailPage= new EmailPage(driver);
        emailPage.ClickWelcomeEmail();
    }
}
