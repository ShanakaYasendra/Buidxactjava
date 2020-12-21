package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.elementhelper;

import java.util.ArrayList;
import java.util.List;

public class EmailPage {
    WebDriver driver;
    public elementhelper helper;

    public EmailPage(WebDriver driver){
        this.driver= driver;
        helper= new elementhelper(driver);
    }

    public void ClickResetEmail()
    {
        List<WebElement> resetEmail = helper.getElementsByXpath("(//a[contains(.,'Reset your Buildxact account password')])");

        resetEmail.get(0).click();
    }

    public void ClickResetLink()
    {

        try {
            Thread.sleep(1000);
            WebElement resetBtn = helper.getElementByLinkText("RESET PASSWORD");
            resetBtn.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //psdbComponent.clickDocumentLink();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //driver.close();
       // driver.switchTo().window(tabs2.get(0));

    }
    public void ClickWelcomeEmail()
    {
        List<WebElement> activateEmail = helper.getElementsByXpath("//a[contains(.,'Welcome to Buildxact')]");
        activateEmail.get(0).click();
    }
    public void ClickActivate()
    {
        //Thread.Sleep(100);
        WebElement resetBtn = helper.getElementByLinkText("ACTIVATE");
        resetBtn.click();

        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

}
