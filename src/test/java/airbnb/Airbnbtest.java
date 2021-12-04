package airbnb;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Airbnbtest {
    WebDriver driver;


    @Test
    public void usersearchbyairbnb() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.airbnb.com/");
        driver.findElement(By.id("bigsearch-query-location-input")).sendKeys("Rome, Italy");
        driver.findElement(By.className("_seuyf")).click();// that fo checkin&checkout
        driver.findElement(By.xpath("//div[@data-testid='datepicker-day-2021-12-10']")).click();
        driver.findElement(By.xpath("//div[@ data-testid='datepicker-day-2021-12-17']")).click();


        driver.findElement(By.className("_37ivfdq")).click();// clicking in guests
        for (int i = 0; i < 2; i++) { //select 2 adults
            //click the button
            driver.findElement(By.xpath("//button[@ data-testid='stepper-adults-increase-button']")).click();
        }
        driver.findElement(By.xpath("//button[@ data-testid='stepper-children-increase-button']")).click();//select one child

        driver.findElement(By.className("_163rr5i")).click();// thats for search
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// wait until item appear


        driver.findElement(By.className("_1yxo0ja")).click();// click on more filters


    driver.findElement(By.xpath("//button[@ data-testid='filterItem-rooms_and_beds-stepper-min_bedrooms-0-increase-button']")).click();//select one bedroom



        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()"
                ,driver.findElement(By.id("filterItem-amenities-checkbox-amenities-4-row-title"))); // scroll down
        driver.findElement(By.id("filterItem-amenities-checkbox-amenities-7-row-checkbox")).click();// click on pool checkbox


        driver.findElement(By.className("_ybm5hv2")).click();// click into show 300 items





    }

    }






