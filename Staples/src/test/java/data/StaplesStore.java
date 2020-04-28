package data;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class StaplesStore extends CommonAPI {
//    @Test  //Test #1
//    public void testTitle() throws InterruptedException {
//        String expectedTitle = driver.getTitle();
//        SoftAssert softAssert = new SoftAssert();
//
//        String actuaTitle = "Staples® Official Online Store";
//        softAssert.assertEquals(actuaTitle, expectedTitle, "Title did not match!");
//        softAssert.assertAll();
//
//        System.out.println(actuaTitle);
//        System.out.println(expectedTitle);
//
//        sleepFor(5);
//    }

//
//    @Test  //Test #2
//    public void testTypingOnSearchBox() throws InterruptedException {
//        List<String> list = TestData.getListOfItems();
//
//        for (int i = 0; i < list.size(); i++) {
//            driver.findElement(By.id("searchInput")).sendKeys(list.get(i), Keys.ENTER);
//            Thread.sleep(2000);
//        }
//    }
//
//    @Test //Test #3
//    public void clickOnItemFromSearchResult() throws InterruptedException {
//        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
//        sleepFor(1);
//        driver.findElement(By.id("searchInput")).clear();
//        driver.findElement(By.id("searchInput")).sendKeys("fountain pens", Keys.ENTER);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/a")).click();
//        sleepFor(3);
//    }
//
//    @Test  //Test #4
//    public void addToShoppingCart() throws InterruptedException {
//        clickOnItemFromSearchResult();
//        sleepFor(2);
//        driver.findElement(By.id("ctaButton")).click();
//        sleepFor(2);
//        driver.findElement(By.className("uiStyles__mmx_icon_close")).click();
//        sleepFor(3);
//
//    }
//}
//
//    @Test  //Test #5
//    public void checkTheItemsInShoppingCart() throws InterruptedException
//    {
//        addToShoppingCart();
//        driver.findElement(By.className("uiStyles__mmx_icon_cart")).click();
//        sleepFor(4);
//    }
//
    @Test //test #6
    public void applyPromoCode()
    {


    }


    @Test //test #7
    public void placeOrder()
    {

    }

    @Test //test #8
    public void signIn() {
        //WebElement element = driver.findElement(By.cssSelector("#Sign\\ In > div:nth-child(1) > div"));

    }

    @Test //test #9
    public void createNewAccount() {
        driver.findElement(By.cssSelector(".Dropdown__sectionMenu ")).click();
        driver.findElement(By.cssSelector(""));
    }
//
//    @Test //test #10
//    public void getPhoneNumber()
//    {
//
//    }
//
//    @Test //test #11
//    public void goToTheSignUpForEmailPage()
//    {
//
//    }
//
//
//    @Test //test #12
//    public void readData()
//    {
//
//         //  sleepFor(5);
//            driver.findElement(By.id("searchInput")).clear();
//
//        }
//
//
}
