package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RunSet {


    private static WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {

        System.setProperty(UploadDriver.upload1, UploadDriver.upload2);



    }

    //Function that finds the Ask Bid and Asked prices.
    @Test(priority = 1)
    public void GetPrice() {


WebDriver driver = new ChromeDriver();

TradePrice.price(driver);



}
    //Function that finds the currency rates and prints them .
@Test(priority = 2)
    public void test2(){
    WebDriver driver = new ChromeDriver();

    Trade_Air_APP.Login(driver);

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    Trade_Air_APP.Trade_Sell(driver);


}

    @Test(priority = 3)
public void test3(){
        WebDriver driver = new ChromeDriver();
        ReadFromConf.Read(driver);
    }


    }
