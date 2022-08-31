package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/*2. Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
 1. LoginTest 2. ForgotPasswordTest
 */
public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }

    @Test
    /*3. Write down the following test into ‘LoginTest’ class
    1. userSholdLoginSuccessfullyWithValidCredentials
    * Enter “Admin” username * Enter “admin123 password
    * Click on ‘LOGIN’ button
    * Verify the ‘Welcome’ text is display - can't see Welcome so use Employee Information
    Employee Information
     */
    public void userShouldLoginSuccessfullyWithValidCredentials (){
        sendKeysToElement(By.xpath("//input[@name='username']"), "Admin");
        sendKeysToElement(By.xpath("//input[@name='password']"), "admin123");
        clickOnElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        String actualmes = getTextFromElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']"));
        System.out.println(actualmes);
        String expectedmes = "Employee Information";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test


    @After
    public void teardown (){
      //  closeBrowser();
    }
}
