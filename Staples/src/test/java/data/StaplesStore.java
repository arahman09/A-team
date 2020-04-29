package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaplesStore extends CommonAPI {
    @Test  //Test #1
    public void testTitle() throws InterruptedException {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        String actuaTitle = "Staples® Official Online Store";
        softAssert.assertEquals(actuaTitle, expectedTitle, "Title did not match!");
        softAssert.assertAll();

        System.out.println(actuaTitle);
        System.out.println(expectedTitle);
        sleepFor(5);
    }


    @Test  //Test #2
    public void testTypingOnSearchBox() throws InterruptedException {
        List<String> list = TestData.getListOfItems();

        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.id("searchInput")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);
        }
    }

    @Test //Test #3
    public void clickOnItemFromSearchResult() throws InterruptedException {
        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
        sleepFor(1);
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/a")).click();
        sleepFor(3);
    }

    @Test  //Test #4
    public void addToShoppingCart() throws InterruptedException {
        clickOnItemFromSearchResult();
        sleepFor(2);
        driver.findElement(By.id("ctaButton")).click();
        sleepFor(2);
        driver.findElement(By.className("uiStyles__mmx_icon_close")).click();
        sleepFor(3);

    }
    @Test  //Test #5
    public void checkTheItemsInShoppingCart() throws InterruptedException
    {
        addToShoppingCart();
        driver.findElement(By.className("uiStyles__mmx_icon_cart")).click();
        sleepFor(3);
    }

    @Test //test #6
    public void applyPromoCode() throws InterruptedException{
        clickOnItemFromSearchResult();
        addToShoppingCart();
        clickOnItemFromSearchResult();
        driver.findElement(By.className("uiStyles__mmx_icon_cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".cart__message > span:nth-child(1)")).click();
        driver.findElement(By.id("coupon_input")).sendKeys("12345", Keys.ENTER);

    }

    @Test //test #7
    public void placeOrder()
    {

    }

    @Test //test #8
        public void signIn() throws InterruptedException{

            WebElement element = driver.findElement(By.cssSelector(".uiStyles__mmx_icon_account"));
            Actions actions = new Actions (driver);
            actions.moveToElement(element).build().perform();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Sign In")).click();
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            driver.findElement(By.id("loginUsername")).sendKeys("sajol123",Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.id("loginPassword")).sendKeys("xyz123", Keys.ENTER);
            Thread.sleep(1000);
            driver.findElement(By.id("loginSubmit")).click();
        }

    @Test //test #9
    public void createNewAccount() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector(".uiStyles__mmx_icon_account"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("createEmail")).sendKeys("sajol@gmail.com",Keys.TAB);
        driver.findElement(By.id("createPassword")).sendKeys("xyz123");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div/div/div[2]/div/div[4]/div")).click();

    }

    @Test //test #10
        public void phoneNumber() throws InterruptedException{
            WebElement element = driver.findElement(By.cssSelector(".uiStyles__mmx_icon_help"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            Thread.sleep(1000);
            driver.findElement(By.linkText("Help Center")).click();
            Thread.sleep(2000);
            String phone = driver.findElement(By.cssSelector("div.Contacts__contacts_row:nth-child(2) > div:nth-child(2) > div:nth-child(2)")).getText();
            System.out.println(phone);
        }
}
