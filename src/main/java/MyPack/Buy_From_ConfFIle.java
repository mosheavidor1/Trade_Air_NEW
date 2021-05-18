package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//The Buying prices from configuration file
public class Buy_From_ConfFIle {
    WebDriver driver = new ChromeDriver();


    public static boolean Read_B(WebDriver driver){

        try (FileReader reader = new FileReader("Trade_Air_conf")) {
            Properties properties = new Properties();
            properties.load(reader);


            String B_USD_ILS = properties.getProperty("BUY1");
            String B_EUR_GBP = properties.getProperty("BUY2");
            String B_EUR_MXN = properties.getProperty("BUY3");
            String B_AUD_USD = properties.getProperty("BUY4");



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







        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }


}

