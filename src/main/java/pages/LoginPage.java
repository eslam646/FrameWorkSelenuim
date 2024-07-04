package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField= By.id("Email");
    private final By passwordField= By.id("Password");
    private final By loginButton= By.cssSelector(".button-1.login-button");
    private final By rememberMEBox= By.cssSelector("#RememberMe");
    private final By errorMessage= By.cssSelector(".message-error");


    private void insertEmail(String email){
        sendKeys(emailField,4,email);
    }

    private void insertPassword(String password){
        sendKeys(passwordField,5,password);
    }

    private void clickOnLoginButton(){
        click(loginButton,5);
    }

    private void clickOnRemeberMeBox(){
        click(rememberMEBox,5);
    }

    public void loginFeature(String email,String password){
        insertEmail(email);
        insertPassword(password);
        clickOnRemeberMeBox();
        clickOnLoginButton();
    }

    public String getErrorMessage(){
        return getText(errorMessage,5);
    }

}
