package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//Function that finds the currency rates and prints them .
public class Trade_Air_APP {

    WebDriver driver = new ChromeDriver();
//Login credentials
    public static Boolean Login(WebDriver driver) {

        driver.get(Constant_Links.App_url);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("TestUser");
        driver.findElement(By.id("password")).sendKeys("TestUser123");
        driver.findElement(By.xpath("//*[@id=\"tradairLoginForm\"]/div[2]/div[3]/input")).submit();

        return true;

    }
//Sell prices
    public static Boolean Trade_Sell(WebDriver driver){

    String x=  driver.findElement(By.xpath("//*[@id=\"mainTabs_tabs-trading\"]//div[@class=\"market_ccPairDropdownWrapper\"]/select/option[@value=\"47\"]")).getText();
    String y=driver.findElement(By.xpath("//*[@id=\"2\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[@class=\"priceBadge_cont\"]")).getText();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(x+":"+" "+y);
return true;
    }

}
