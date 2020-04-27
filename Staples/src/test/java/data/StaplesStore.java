package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class StaplesStore extends CommonAPI{

    @Test(priority = 1)  //Test #1
    public void testTitle() throws InterruptedException {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        String actuaTitle = "Staples® Official Online Store";
        softAssert.assertEquals(actuaTitle, expectedTitle, "Title did not match!");
        softAssert.assertAll();

        System.out.println(actuaTitle);
        System.out.println(expectedTitle);

        sleepFor(3);
    }
//
//    @Test(priority = 2)  //Test #2
//    public void testTypingOnSearchBox() throws InterruptedException {
//        List<String> list = TestData.getListOfItems();
//
//        for (int i = 0; i < list.size(); i++) {
//            driver.findElement(By.cssSelector("#searchInput")).clear();
//            driver.findElement(By.id("searchInput")).sendKeys(list.get(i), Keys.ENTER);
//            Thread.sleep(2000);
//        }
//    }
//
//    @Test(priority = 3)//Test #3
//    public void clickOnItemFromSearchResult() throws InterruptedException {
//        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
//        sleepFor(1);
//        driver.findElement(By.id("searchInput")).clear();
//        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/a")).click();
//        sleepFor(3);
//    }
//
//    @Test(priority = 4)  //Test #4
//    public void addToShoppingCart() throws InterruptedException {
//        clickOnItemFromSearchResult();
//        sleepFor(2);
//        driver.findElement(By.id("ctaButton")).click();
//        sleepFor(2);
//        driver.findElement(By.className("uiStyles__mmx_icon_close")).click();
//        sleepFor(3);
//
//    }
//
//    @Test(priority = 5) //Test #5
//    public void checkTheItemsInShoppingCart() throws InterruptedException {
//        addToShoppingCart();
//        driver.findElement(By.className("uiStyles__mmx_icon_cart")).click();
//        sleepFor(4);
//    }
//
//    @Test(priority = 6)//test #6
//    public void applyPromoCode() throws InterruptedException {

//        driver.findElement(By.id("searchInput")).clear();
//        driver.findElement(By.id("searchInput")).sendKeys("black toner", Keys.ENTER);
//      //  Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".div.carousel__tile:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div")).click();
//        driver.findElement(By.id(".button__button button__fill button__primary button__border_primary")).click();
//        sleepFor(2);
////        driver.findElement(By.cssSelector(".common__atc-button-section-dotcom")).click();
//        driver.findElement(By.cssSelector(".cart__message")).sendKeys("12345", Keys.ENTER);
////        Thread.sleep(5000);
//        checkTheItemsInShoppingCart();
//        driver.findElement(By.cssSelector(".cart__message")).sendKeys("12345", Keys.ENTER);
//        Thread.sleep(5000);

//    }
//
//    @Test(priority = 7)//test #7
//    public void placeOrder() throws InterruptedException {
//        checkTheItemsInShoppingCart();
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/div/div/div/div[2]/button")).click();
//        Thread.sleep(5000);
//    }

//    @Test (priority = 8) //test #8
//        public void signIn() throws InterruptedException {
//        Actions action = new Actions (driver);
//        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[3]/div/div[4]/div/div[2]/div/div"))).perform();


//            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[3]/div/div[4]/div/div[2]/div/div/div[1]")).click();
//            Thread.sleep(3000);
//            driver.findElement(By.xpath(" ")).click();
//            Thread.sleep(5000);
//            driver.findElement(By.id("login")).click();
//            Thread.sleep(3000);
   }
//
//    @Test (priority =9)//test #9
//    public void createNewAccount() {
//        driver.findElement(By.cssSelector(".Dropdown__sectionMenu ")).click();
//        driver.findElement(By.cssSelector(""));
//    }
//
//    @Test (priority = 10)//test #10
//    public void getPhoneNumber()
//    {
//
//    }
//
//    @Test (priority = 11)//test #11
//    public void goToTheSignUpForEmailPage()
//    {
//
//    }
//
//
//    @Test (priority = 12)//test #12
//    public void readData()
//    {
//
//         //  sleepFor(5);
//            driver.findElement(By.id("searchInput")).clear();
//
//    }


//    }

