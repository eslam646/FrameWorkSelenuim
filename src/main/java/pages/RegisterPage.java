package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class RegisterPage extends MethodHandles {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private final By maleRadioButton= By.cssSelector("#gender-male");
    private final By femaleRadioButton= By.cssSelector("#gender-female");
    private final By firstName= By.cssSelector("#FirstName");
    private final By lastName= By.cssSelector("#LastName");
    private final By e_Mail= By.id("Email");
    private final By day= By.xpath("//*[@name='DateOfBirthDay']");
    private final By month= By.xpath("//*[@name='DateOfBirthMonth']");
    private final By year= By.xpath("//*[@name='DateOfBirthYear']");
    private final By companyName= By.id("Company");
    private final By newsletterCheckBox= By.id("Newsletter");
    private final By password= By.id("Password");
    private final By confirmPassword= By.id("ConfirmPassword");
    private final By registerButton= By.id("register-button");

    private void checkMaleRadioButton(int value){
        if(value==1) {
            click(maleRadioButton, 5);
        }
    }
    private void checkFemaleRadioButton(int value){
        if(value==1) {
            click(femaleRadioButton, 5);
        }
    }
    private void insertFirstName(String text){
        sendKeys(firstName,5,text);
    }
    private void insertLastName(String text){
        sendKeys(lastName,5,text);
    }
    private void insertEmail(String text){
        sendKeys(e_Mail,5,text);
    }
    private void selectDay(String text){
        selectList(day,5,text);
    }
    private void selectMonth(String text){
        selectList(month,5,text);
    }
    private void selectYear(String text){
        selectList(year,5,text);
    }
    private void insertCompanyName(String text){
        sendKeys(companyName,5,text);
    }
    private void checkNewsLetterCheckBox(int value){
        if(value==1) {
            click(newsletterCheckBox, 5);
        }
    }
    private void insertPassword(String pass){
        sendKeys(password,5,pass);
    }
    private void insertConfirmPassword(String confPass){
        sendKeys(confirmPassword,5,confPass);
    }
    private void clickOnRegisterButton(){
        click(registerButton,5);
    }
    public RegisterResultPage registerFeature(int male,int female,String fName,String lName,String dayValue,
                                String monthValue,String yearValue,String emailValue,String companyValue,int newsLetterCheckBoxValue,
                                String passwordValue,String confirmPasswordValue)
    {
        checkMaleRadioButton(male);
        checkFemaleRadioButton(female);
        insertFirstName(fName);
        insertLastName(lName);
        selectDay(dayValue);
        selectMonth(monthValue);
        selectYear(yearValue);
        insertEmail(emailValue);
        insertCompanyName(companyValue);
        checkNewsLetterCheckBox(newsLetterCheckBoxValue);
        insertPassword(passwordValue);
        insertConfirmPassword(confirmPasswordValue);
        clickOnRegisterButton();
        return new RegisterResultPage(driver);
    }
    public RegisterResultPage registerFeature(String fName,String lName,String emailValue, String passwordValue,String confirmPasswordValue)
    {
        insertFirstName(fName);
        insertLastName(lName);
        insertEmail(emailValue);
        insertPassword(passwordValue);
        insertConfirmPassword(confirmPasswordValue);
        clickOnRegisterButton();
        return new RegisterResultPage(driver);
    }
}
