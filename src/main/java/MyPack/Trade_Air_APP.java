package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//Function that finds the currency rates and prints them .
public class Trade_Air_APP {

    WebDriver driver = new ChromeDriver();
//Login credentials
    public static Boolean Login(WebDriver driver) {

        driver.get(Constant_Links.App_url);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys(Constant_Links.User_Login);
        driver.findElement(By.id("password")).sendKeys(Constant_Links.Password_Login);
        driver.findElement(By.xpath("//*[@id=\"tradairLoginForm\"]//input[@class=\"button\"]")).submit();
        WebElement Failed_login = driver.findElement(By.xpath("//div[@class=\"error\"]"));
        {
            if (Failed_login.isDisplayed()) {
                System.out.println("Failed login");
            } else {
                WebElement success = driver.findElement(By.xpath("//div[@class=\"success\"]"));
                {
                    System.out.println("Login succeed");
                }
            }
            return true;

        }
    }
//Buy prices
    public static Boolean Trade_Buy(WebDriver driver){

        System.out.println("The Buy prices are:");
String USD_ILS="USD/ILS:";
    String USD_ILS_P=driver.findElement(By.xpath("//*[@id=\"1\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(USD_ILS+":"+" "+USD_ILS_P);

        String EUR_GBP="EUR/GBP:";

        String EUR_GBP_P=driver.findElement(By.xpath("//*[@id=\"2\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(EUR_GBP+":"+" "+EUR_GBP_P);

String EUR_MXN="EUR_MXN";
        String EUR_MXN_P=driver.findElement(By.xpath(" //*[@id=\"3\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(EUR_MXN+":"+" "+EUR_MXN_P);

String AUD_USD= "AUD_USD";
        String AUD_USD_P=driver.findElement(By.xpath("//*[@id=\"4\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(AUD_USD+":"+" "+AUD_USD_P);


return true;
    }


    //Sell prices
    public static Boolean Trade_Sell(WebDriver driver){

        System.out.println("The Sell prices are:");
        String USD_ILS="USD/ILS:";
        String USD_ILS_P=driver.findElement(By.xpath("//*[@id=\"1\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(USD_ILS+":"+" "+USD_ILS_P);

        String EUR_GBP="EUR/GBP:";

        String EUR_GBP_P=driver.findElement(By.xpath("//*[@id=\"2\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(EUR_GBP+":"+" "+EUR_GBP_P);

        String EUR_MXN="EUR_MXN";
        String EUR_MXN_P=driver.findElement(By.xpath("//*[@id=\"3\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(EUR_MXN+":"+" "+EUR_MXN_P);

        String AUD_USD= "AUD_USD";
        String AUD_USD_P=driver.findElement(By.xpath("//*[@id=\"4\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(AUD_USD+":"+" "+AUD_USD_P);


        return true;
    }


}
