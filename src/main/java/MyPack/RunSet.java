package MyPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
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
    public void Get_BUY_SELL() {
        WebDriver driver = new ChromeDriver();

        Trade_Air_APP.Login(driver);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Trade_Air_APP.Trade_Sell(driver);
        Trade_Air_APP.Trade_Buy(driver);


    }

    //Login and get data from configuration file
    @Test(priority = 3)
    public void GET_CONF() {
        WebDriver driver = new ChromeDriver();
        Login_From_ConfFIle.Read(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Buy_From_ConfFIle.Read_B(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Sell_From_ConfFIle.Read_S(driver);

    }


@AfterTest

    public void endSession(){
        driver.quit();





        }


    }


