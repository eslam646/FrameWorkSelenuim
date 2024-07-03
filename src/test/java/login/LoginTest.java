package login;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJsonFile;

import java.io.Console;
import java.io.FileNotFoundException;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws FileNotFoundException {
        LoginPage loginPage=homePage.clickOnLoginButton();
        System.out.println(dataModel().Login.ValidCredentials.Username);
        System.out.println(dataModel().Login.ValidCredentials.Password);
        loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel().Login.ValidCredentials.Password);
    }
}
