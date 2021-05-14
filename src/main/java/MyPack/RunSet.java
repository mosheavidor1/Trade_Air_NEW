package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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


    @Test(priority = 1)
    public void GetUrl() {


WebDriver driver = new ChromeDriver();

TradePrice.price(driver).booleanValue();



}

@Test(priority = 2)
    public void test2(){
    WebDriver driver = new ChromeDriver();

    Trade_Air_APP.Login(driver);

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    Trade_Air_APP.Trade_Sell(driver);


}





    }
