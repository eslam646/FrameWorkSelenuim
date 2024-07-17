package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class RegisterResultPage extends MethodHandles {
    public RegisterResultPage(WebDriver driver) {
        super(driver);
    }
    private final By registerMessage=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
    private String getRegisterMessage(){
        return getText(registerMessage,10);
    }

    public String registerResultFeature(){
        return getRegisterMessage();
    }
}
