package login;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJsonFile;

import java.io.Console;
import java.io.FileNotFoundException;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws FileNotFoundException {
        LoginPage loginPage=homePage.clickOnLoginButton();
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel().Login.ValidCredentials.Password);
        assertTrue(loginPage.getErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
    }
}
