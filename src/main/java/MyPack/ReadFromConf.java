package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadFromConf {
    WebDriver driver = new ChromeDriver();


   public static boolean Read(WebDriver driver){

        try (FileReader reader = new FileReader("Trade_Air_conf")) {
            Properties properties = new Properties();
            properties.load(reader);

            String Url = properties.getProperty("URL");
            String Username = properties.getProperty("Username");
            String Password = properties.getProperty("Password");

            System.out.println(Url);
            System.out.println(Username);
            System.out.println(Password);

            driver.get(Url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Username+" "+Password);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }


}

