package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.PointerInput;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

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
            sleepFor(3);
            driver.findElement(By.id("searchInput")).clear();

        }
    }


    @Test //Test #3
    public void clickOnItemFromSearchResult() throws InterruptedException {
        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
        sleepFor(3);
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/a")).click();
        sleepFor(1);
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
    public void checkTheItemsInShoppingCart() throws InterruptedException {
        addToShoppingCart();
        driver.findElement(By.className("uiStyles__mmx_icon_cart")).click();
        sleepFor(4);
    }


    @Test //Test #6
    public void applyPromoCode() throws InterruptedException {
        checkTheItemsInShoppingCart();
        driver.findElement(By.className("cart__message")).click();
        sleepFor(2);
        driver.findElement(By.name("couponsCode")).sendKeys("12345", Keys.ENTER);
        sleepFor(2);
        //Coupon doesn't exist.


    }
    //ASK MAFI VAI HOW TO ADD MULTIPLE PARAMETER AND RUN WITH @PARAMETERS
    @Test //Test #7
    public void placeOrder(/*ask mafi vai how to add multiple parameter and run8*/) throws InterruptedException{
        checkTheItemsInShoppingCart();
        driver.findElement(By.className("cart-dropdown__cartWrapper")).click();
        sleepFor(2);
        driver.findElement(By.cssSelector(".button__button.button__fill.button__primary")).click();
        sleepFor(2);






    }

    // MUST FINISH IT LATER.
    @Test //Test 8
    public void signIn() throws InterruptedException {

        driver.findElement(By.linkText("My Account")).click();
        sleepFor(5);


    }}









