package data;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class FacebookTest extends CommonAPI {
    @Test
    public void logIn() throws InterruptedException {
        driver.findElement(By.cssSelector("#email")).sendKeys("sajol@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pass")).sendKeys("xyz123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#loginbutton")).click();
        Thread.sleep(20000);

    }

    @Test
    public void setUpNewAccount() throws InterruptedException {

        //user name & password
        driver.findElement(By.xpath("//input[@name='firstname' and contains(@class,'inputtext')]")).sendKeys("Lionel");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname' and contains(@class,'inputtext')]")).sendKeys("Messi");
        driver.findElement(By.xpath("//input[@name='reg_email__' and contains(@class,'inputtext')]")).sendKeys("3479876236");
        driver.findElement(By.xpath("//input[@name='reg_passwd__' and contains(@class,'inputtext')]")).sendKeys("xyz123@");
        Thread.sleep(1000);

        //DOB
        Select month = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        month.selectByIndex(4);
        Select day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        day.selectByValue("6");
        Select year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        year.selectByValue("1990");
        Thread.sleep(1000);

        // Gender
        driver.findElement(By.cssSelector("span._5k_2:nth-child(2)")).click();

        //click sign up
        driver.findElement(By.name("websubmit")).click();

    }
}
