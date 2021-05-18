package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//Login from configuration file
public class Login_From_ConfFIle {
    WebDriver driver = new ChromeDriver();


   public static boolean Read(WebDriver driver){

        try (FileReader reader = new FileReader("Trade_Air_conf")) {
            Properties properties = new Properties();
            properties.load(reader);

            String Url = properties.getProperty("URL");
            String Username = properties.getProperty("Username");
            String Password = properties.getProperty("Password");
            String B_USD_ILS = properties.getProperty("BUY1");
            String B_EUR_GBP = properties.getProperty("BUY2");
            String B_EUR_MXN = properties.getProperty("BUY3");
            String B_AUD_USD = properties.getProperty("BUY4");
            String USD_ILS = properties.getProperty("SELL1");
            String EUR_GBP = properties.getProperty("SELL2");
            String EUR_MXN = properties.getProperty("SELL3");
            String AUD_USD = properties.getProperty("SELL4");


            driver.get(Url);
            driver.manage().window().maximize();
            driver.findElement(By.id("username")).sendKeys(Username);
            driver.findElement(By.id("password")).sendKeys(Password);
            driver.findElement(By.xpath("//*[@id=\"tradairLoginForm\"]//input[@class=\"button\"]")).submit();
            WebElement Failed_login = driver.findElement(By.xpath("//div[@class=\"error\"]"));
            {
                if (Failed_login.isDisplayed()) {
                    System.out.println("Failed login");
                } else {
                    WebElement success = driver.findElement(By.xpath("//div[@class=\"success\"]"));
                    {
                        System.out.println("Login succeed");


                        System.out.println("The Buy prices are:");

                        String USD_ILS_P = driver.findElement(By.xpath("//*[@id=\"1\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(B_USD_ILS + ":" + " " + USD_ILS_P);


                        String EUR_GBP_P = driver.findElement(By.xpath("//*[@id=\"2\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(B_EUR_GBP + ":" + " " + EUR_GBP_P);


                        String EUR_MXN_P = driver.findElement(By.xpath(" //*[@id=\"3\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(B_EUR_MXN + ":" + " " + EUR_MXN_P);


                        String AUD_USD_P = driver.findElement(By.xpath("//*[@id=\"4\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_offerCont marketTopOfTheBook_button flex1 flexContCol theme-buy theme-disable-able marketTopOfTheBook_redGradient\"]//div[@class=\"priceBadge_cont\"]\n")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(B_AUD_USD + ":" + " " + AUD_USD_P);


                        System.out.println("The Sell prices are:");

                        String USD_ILS_Sell = driver.findElement(By.xpath("//*[@id=\"1\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(USD_ILS + ":" + " " + USD_ILS_P);


                        String EUR_GBP_Sell = driver.findElement(By.xpath("//*[@id=\"2\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(EUR_GBP + ":" + " " + EUR_GBP_P);


                        String EUR_MXN_Sell = driver.findElement(By.xpath("//*[@id=\"3\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(EUR_MXN + ":" + " " + EUR_MXN_P);


                        String AUD_USD_Sell = driver.findElement(By.xpath("//*[@id=\"4\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(AUD_USD + ":" + " " + AUD_USD_P);

                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }


}

