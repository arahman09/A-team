package data;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NyTimesHome extends CommonAPI {

    @Test
    public void logIn() throws InterruptedException {

        driver.findElement(By.cssSelector("a.css-1kj7lfb:nth-child(2) > button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#email")).sendKeys("sajol@gmail.com",Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#password")).sendKeys("abcd1234", Keys.ENTER);
        Thread.sleep(1000);
    }

    @Test
    public void checkWorldNews() throws InterruptedException {

        driver.findElement(By.cssSelector(".css-1d8a290 > ul:nth-child(1) > li:nth-child(1) > a")).click();
        Thread.sleep(1000);
    }

    @Test
    public void readArticleFromOpinionPage() throws InterruptedException {
        driver.findElement(By.cssSelector(".css-1d8a290 > ul:nth-child(1) > li:nth-child(6) > a")).click();
        driver.findElement((By.cssSelector("li.css-6p3lz8:nth-child(8) > a"))).click();
        Thread.sleep(1000);
    }
    @Test
    public void checkNewsForAsia() throws InterruptedException {
        driver.findElement(By.cssSelector(".css-fnhm75 > svg")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".css-1axrnfw")).sendKeys("Asia", Keys.ENTER);
    }
}