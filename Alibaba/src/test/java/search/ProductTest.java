package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTest extends CommonAPI {

    public static List<String > getProducts() {

        List<String> productsList = new ArrayList<>();

        productsList.add("Gel Pen");
        productsList.add("Winter Hat");
        productsList.add("Vacuum Cleaner ");
        productsList.add("Air Freshener");
        productsList.add("Phone Charger");

        return productsList;
    }

    @Test
    public void testTypingOnSearchBox() throws InterruptedException {
        //connect to db, read it for me
        List<String> list = ProductTest.getProducts();
        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.cssSelector(".ui-searchbar-keyword")).clear();
            driver.findElement(By.cssSelector(".ui-searchbar-keyword")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(3000);

        }
    }
}
