package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//The selling prices from  configuration file
public class Sell_From_ConfFIle {

    WebDriver driver = new ChromeDriver();


    public static boolean Read_S(WebDriver driver){

        try (FileReader reader = new FileReader("Trade_Air_conf")) {
            Properties properties = new Properties();
            properties.load(reader);


            String USD_ILS = properties.getProperty("SELL1");
            String EUR_GBP = properties.getProperty("SELL2");
            String EUR_MXN = properties.getProperty("SELL3");
            String AUD_USD = properties.getProperty("SELL4");




                        System.out.println("The Sell prices are:");

                        String USD_ILS_Sell = driver.findElement(By.xpath("//*[@id=\"1\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(USD_ILS + ":" + " " + USD_ILS_Sell);


                        String EUR_GBP_Sell = driver.findElement(By.xpath("//*[@id=\"2\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(EUR_GBP + ":" + " " + EUR_GBP_Sell);


                        String EUR_MXN_Sell = driver.findElement(By.xpath("//*[@id=\"3\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(EUR_MXN + ":" + " " + EUR_MXN_Sell);


                        String AUD_USD_Sell = driver.findElement(By.xpath("//*[@id=\"4\"]//div[@class=\"marketTopOfTheBook_directionCont marketTopOfTheBook_bidCont marketTopOfTheBook_button flex1 flexContCol theme-sell theme-disable-able marketTopOfTheBook_greenGradient\"]//div[@class=\"priceBadge_cont\"]")).getText();
                        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                        System.out.println(AUD_USD + ":" + " " + AUD_USD_Sell);



        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }


}



