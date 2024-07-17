package register;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.RegisterResultPage;

import java.io.FileNotFoundException;

import static org.testng.AssertJUnit.assertTrue;

public class RegisterTest extends BaseTest {
    @Test
    public void registerTest() throws FileNotFoundException {
        RegisterPage registerPage=homePage.clickOnRegisterButton();
        RegisterResultPage registerResultPage=registerPage.registerFeature(dataModel().Register.Male,dataModel().Register.Female,dataModel().Register.FirstName,dataModel().Register.LastName,
                dataModel().Register.Day,dataModel().Register.Month,dataModel().Register.Year,dataModel().Register.Email,dataModel().Register.CompanyName,dataModel().Register.Newsletter,dataModel().Register.Password,dataModel().Register.ConfirmPassword);
        assertTrue(registerResultPage.registerResultFeature().contains("Your registration completed"));
    }

    @Test
    public void registerTestRequired() throws FileNotFoundException {
        RegisterPage registerPage=homePage.clickOnRegisterButton();
        RegisterResultPage registerResultPage=registerPage.registerFeature(dataModel().Register.FirstName,dataModel().Register.LastName,dataModel().Register.Email,dataModel().Register.Password,dataModel().Register.ConfirmPassword);
        assertTrue(registerResultPage.registerResultFeature().contains("Your registration completed"));
    }
}
