package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import products.TestProduct;

import java.util.List;

public class ProductTest extends CommonAPI {

    @Test
    public void testTypingOnSearchBox() throws InterruptedException {
        //connect to db, read it for me
        List<String> list = TestProduct.getProducts();
        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.cssSelector(".ui-searchbar-keyword")).clear();
            driver.findElement(By.cssSelector(".ui-searchbar-keyword")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);
            //test commit;

        }
    }
}
