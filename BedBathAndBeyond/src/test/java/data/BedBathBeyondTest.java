package data;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class BedBathBeyondTest extends CommonAPI {
/*

    @Test // test 4
    public void exploreIdeaBoards() throws InterruptedException{
        driver.findElement(By.cssSelector("a.HeaderNavigation-inline_37InfC")).click();
        driver.findElement(By.cssSelector(".CreateIdeaBoard_5Xhall")).click();
        driver.findElement(By.cssSelector(".large-12 > div:nth-child(1) > div")).click();
        driver.findElement(By.id("create-ideaboardName")).sendKeys("Dining Room", Keys.ENTER);
        Thread.sleep(2000);
    }

    // test 5

    @Test // test 6
    public void selectAppToDownload() throws InterruptedException{
        driver.findElement(By.cssSelector(".downloadIos")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("link")).click();
        Thread.sleep(2000);
    }


    @Test // test 10 Evan Arafat
    public void checkOutClearanceAndSavings() throws InterruptedException{
        driver.findElement(By.id("searchInput")).sendKeys("clearance and savings", Keys.ENTER);
        sleepFor(3);
    }

    @Test // test 11 Evan Arafat
    public void buyGiftCard() throws InterruptedException{
        driver.findElement(By.id("searchInput")).sendKeys("Buy gift card", Keys.ENTER);

        sleepFor(2);
        driver.findElement(By.linkText("Shop Gift Cards")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector(".input-button.Button_5b9DYQ.activePressed.Button_lzViVt.PrimaryCta_3qwIHq.mb1")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector(".input-button.Button_5b9DYQ.activePressed.Button_7Eh9Ot.fullWidth.mb1")).click();
        sleepFor(2);
        driver.findElement(By.linkText("View Cart & Checkout")).click();
        driver.findElement(By.cssSelector(".input-button.Button_5b9DYQ.activePressed.Button_7Eh9Ot.Button_4h96Jg.mb1")).click();
        sleepFor(3);
        // Checkout Complete, purchased gift card.
    }

    @Test // test 12 Evan Arafat
    public void testHelpCenter() throws InterruptedException{
            // testing help center and clicking returns link.
        driver.findElement(By.linkText("Help")).click();
        sleepFor(1);
        driver.findElement(By.linkText("Returns")).click();
        sleepFor(2);
    }*/

    @Test // test 12a Evan Arafat
    // INCOMPLETE MUST FINISH LATER
    public void testHelpCenterSearchBar() throws InterruptedException{

        Actions mouse = new Actions(driver);
        driver.findElement(By.linkText("Help")).click();
        sleepFor(1);
        WebElement element = driver.findElement(By.cssSelector("ul.PaddleList>li:nth-of-type(2)"));
        mouse.moveToElement(element).build().perform();
        sleepFor(1);
        driver.findElement(By.linkText("Can my order be delivered internationally?")).click();




    }

}
