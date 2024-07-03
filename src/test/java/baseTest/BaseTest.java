package baseTest;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import reader.ReadDataFromJsonFile;

import java.io.FileNotFoundException;

public class BaseTest {
    WebDriver driver;
    protected HomePage homePage;
    protected ReadDataFromJsonFile readDataFromJsonFile;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() throws FileNotFoundException {

        driver.get(dataModel().URL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public DataModel dataModel() throws FileNotFoundException {
        readDataFromJsonFile =new ReadDataFromJsonFile();
        return readDataFromJsonFile.readFromJsonFile();
    }
}
