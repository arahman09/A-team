package data;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class BedBathBeyondTest extends CommonAPI {

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
}
