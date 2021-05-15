package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Function that finds the Ask Bid and Asked prices.
public class TradePrice {
    WebDriver driver = new ChromeDriver();

    public static Boolean price(WebDriver driver) {


        driver.get(Constant_Links.Url_Yahoo);
        driver.manage().window().maximize();
        WebElement Bid = driver.findElement(By.xpath("//td[@data-test=\"BID-value\"]"));
        {

            if (Bid.isDisplayed()) {
                System.out.println("The Bid price is :" + " " + Bid.getText());
            } else {
                System.out.println("Element does not exists");
                return false;

            }


            WebElement Offer = driver.findElement(By.xpath("//td[@data-test=\"ASK-value\"]"));
            {
                if (Offer.isDisplayed()) {
                    System.out.println("The offer price is :" + " " + Offer.getText());
                } else {
                    System.out.println("Element does not exists");
                    return false;
                }


                return true;
            }

        }
    }
}



