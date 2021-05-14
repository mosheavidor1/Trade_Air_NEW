package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TradePrice {
    WebDriver driver = new ChromeDriver();

    public static Boolean price(WebDriver driver) {


        driver.get(ConstantURL.Url_Yahoo);
        driver.manage().window().maximize();
        String Bid = driver.findElement(By.xpath("//td[@data-test=\"BID-value\"]")).getText();
        System.out.println("The Bid price is :" + " " + Bid);


        String Offer = driver.findElement(By.xpath("//td[@data-test=\"ASK-value\"]")).getText();

        System.out.println("The offer price is :" + " " + Offer);

return true;
    }

}




