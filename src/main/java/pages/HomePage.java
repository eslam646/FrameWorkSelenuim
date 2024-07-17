package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginButton= By.linkText("Log in");
    private final By registerButton= By.linkText("Register");

    public LoginPage clickOnLoginButton(){
        click(loginButton,6);
        return new LoginPage(driver);
    }

    public RegisterPage clickOnRegisterButton(){
        click(registerButton,5);
        return new RegisterPage(driver);
    }
}
